package edu.citytech.counter.services;


import java.util.ArrayList;
import java.util.List;
import com.learning.java.data.repository.ExcelRepository;

import edu.citytech.counter.dto.Category_;
import edu.citytech.counter.dto.stock;
import jakarta.inject.Singleton;

//adding the @Singleton annotation to the class makes it a singleton bean in Micronaut
@Singleton
//BestEnergyStocks2024-10-25.xlsx
public class stockService {
    private static String DIR = System.getenv("CST_3613_DATA");
    private static List<stock> list = new ArrayList<>();
    private static List<Category_> categories = new ArrayList<>();

    static {
        //take 3 xlsx files
        //String[] files = {     "Energy", "REITS","ConsumerStaples", "Gaming"};//"BestEnergyStocks2024-10-25"

        categories.add(new Category_(1, "Energy"));
        categories.add(new Category_(2, "REITS"));
        categories.add(new Category_(4, "ConsumerStaples"));
        categories.add(new Category_(8, "Gaming"));
		//String fileName = DIR + "/BestEnergyStocks2024-10-25.xlsx";		
        //String fileName = DIR + "/" + files[1] + ".xlsx";	
		int sheetNumber = 0, skip = 1;	
		
		//var repository = new ExcelRepository<stock>(fileName, sheetNumber, skip);				
		//repository.findAll(stock.class, list::add);
        //for (String afile : file){} sfile is category and categories is file

        for (var  category : categories) {
            String fileName = DIR + "/" + category.category() + ".xlsx";
            var repository = new ExcelRepository<stock>(fileName, sheetNumber, skip);				
            repository.findAll(stock.class, list::add);
        }
        for (stock stock : list) {
            System.out.println(stock.toString());
        }   
	
	}
    public int size(){
        return list.size();
    }
    public List<stock> getDividendStocks() {
        List<stock> divList = new ArrayList<>();
        for (stock stock : list) {
            if (stock.getDivYield() > 0) {
                divList.add(stock);
            }
        }
        return divList;
    }
    public List<stock> getMarketCapInMillions() {
        List<stock> billClub = new ArrayList<>();
        for (stock energyStock : list) {
            if (energyStock.getMarketCapInMillions() >= 1) {
                billClub.add(energyStock);
            }
        }
        return billClub;
    }
    public List<stock> getAll() {
        return list;
    }
    public List<stock> filter(int code) {

        List<stock> filteredList = new ArrayList<>();

        for(Category_ category : categories) {
            boolean display = (category.code() & code)> 0;
            if(display) {
                //System.out.println("Category: " + category.category());
                var newList = list.stream().filter(e -> e.getCategory().equals(e.getCategory())).toList();
                filteredList.addAll(newList);
            }
        }
        return list;
    }
}
