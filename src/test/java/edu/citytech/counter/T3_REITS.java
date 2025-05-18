package edu.citytech.counter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.citytech.counter.services.REITS_services;

public class T3_REITS {
       @Test
    void t1(){
        var services = new REITS_services();
        var Result = services.findAll();
        int Actual = Result.size();
        int Expected = 177;

        Result.forEach(System.out::println);
        assertEquals(Expected, Actual);
        
    }
}
