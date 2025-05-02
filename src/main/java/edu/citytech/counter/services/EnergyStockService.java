package edu.citytech.counter.services;


import java.util.ArrayList;
import java.util.List;
import com.learning.java.data.repository.ExcelRepository;

import edu.citytech.counter.dto.EnergyStock;

//BestEnergyStocks2024-10-25.xlsx
public class EnergyStockService {
    private static String DIR = System.getenv("CST_3613_DATA");
    private static List<EnergyStock> list = new ArrayList<>();

    static {
		String fileName = DIR + "/BestEnergyStocks2024-10-25.xlsx";		
		int sheetNumber = 0, skip = 1;	
		
		var repository = new ExcelRepository<EnergyStock>(fileName, sheetNumber, skip);				
		repository.findAll(EnergyStock.class, list::add);

        for (EnergyStock stock : list) {
            System.out.println(stock.toString());
        }   
	
	}
    public int size(){
        return list.size();
    }
}
