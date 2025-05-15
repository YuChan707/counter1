package edu.citytech.counter.services;


import java.util.ArrayList;
import java.util.List;
import com.learning.java.data.repository.ExcelRepository;

import edu.citytech.counter.dto.stock;
import jakarta.inject.Singleton;

//adding the @Singleton annotation to the class makes it a singleton bean in Micronaut
@Singleton
//BestEnergyStocks2024-10-25.xlsx
public class stockService {
    private static String DIR = System.getenv("CST_3613_DATA");
    private static List<stock> list = new ArrayList<>();

    static {
		String fileName = DIR + "/BestEnergyStocks2024-10-25.xlsx";		
		int sheetNumber = 0, skip = 1;	
		
		var repository = new ExcelRepository<stock>(fileName, sheetNumber, skip);				
		repository.findAll(stock.class, list::add);

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
}
