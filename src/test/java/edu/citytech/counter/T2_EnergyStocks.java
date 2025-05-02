package edu.citytech.counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import edu.citytech.counter.dto.EnergyStock;
import edu.citytech.counter.services.EnergyStockService;

public class T2_EnergyStocks {
    @Test
    void t1(){

        System.out.println(System.getenv("CST_3612_DATA"));
        EnergyStockService services = new EnergyStockService();
        
        int Actual = services.size();
        int Expected = 232;

        assertEquals(Expected, Actual);
        
    }

    @Test
    void t2(){

        System.out.println(System.getenv("CST_3612_DATA"));
        EnergyStockService services = new EnergyStockService();
        
        List<EnergyStock> list = services.getDividendStocks();
        int Actual = list.size();
        int Expected = 150;
        assertEquals(Expected, Actual);
        
    }

    @Test
    void t3(){

        System.out.println(System.getenv("CST_3612_DATA"));
        EnergyStockService services = new EnergyStockService();
        
        List<EnergyStock> list = services.getMarketCapInMillions();
        int Actual = list.size();
        int Expected = 215;
        assertEquals(Expected, Actual);
        
    }
}
