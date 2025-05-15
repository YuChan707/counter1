package edu.citytech.counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import edu.citytech.counter.dto.stock;
import edu.citytech.counter.services.stockService;

public class T2_EnergyStocks {
    @Test
    void t1(){

        System.out.println(System.getenv("CST_3612_DATA"));
        stockService services = new stockService();
        
        int Actual = services.size();
        int Expected = 232;

        assertEquals(Expected, Actual);
        
    }

    @Test
    void t2(){
        stockService services = new stockService();
        
        List<stock> list = services.getDividendStocks();
        int Actual = list.size();
        int Expected = 150;
        assertEquals(Expected, Actual);
        
    }

    @Test
    void t3(){
        stockService services = new stockService();
        
        List<stock> list = services.getMarketCapInMillions();
        int Actual = list.size();
        int Expected = 150;
        list.forEach(System.out::println);
        System.out.println("Market Cap in Millions: " + Actual);
        assertEquals(Expected, Actual);
        
    }
}
