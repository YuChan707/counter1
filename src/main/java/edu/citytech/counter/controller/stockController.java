package edu.citytech.counter.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.citytech.counter.services.stockService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/stocks")
public class stockController {
    @Inject
    stockService services;

    @Get(value = "/all-Test")
    public Object getAll(){

        Map<String, Object> map = new HashMap<>();
        map.put("data", new ArrayList<>());
        map.put("size", 0);

        return map;
    }

    //@Get(value = "/dividends")
    @Get(value = "/{type}")
    public Object getAllDividens(String type){

        Map<String, Object> map = new HashMap<>();
        var data = type.equals("dividends") ? services.getDividendStocks() : services.getAll();
        map.put("data", data);
        map.put("size", data.size());
        System.out.println("Developver : ");
        
        return map;
    }
}
