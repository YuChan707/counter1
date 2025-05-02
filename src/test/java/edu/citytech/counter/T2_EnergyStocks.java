package edu.citytech.counter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.citytech.counter.services.EnergyStockService;

public class T2_EnergyStocks {
    void t1(){
        EnergyStockService services = new EnergyStockService();
        
        int Actual = services.size();
        int Expected = 232;

        assertEquals(Expected, Actual);
    }
}
