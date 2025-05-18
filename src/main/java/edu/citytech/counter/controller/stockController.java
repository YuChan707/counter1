package edu.citytech.counter.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.citytech.counter.services.REITS_services;
import edu.citytech.counter.services.stockService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/stocks")
public class stockController {
    @Inject
    stockService services;

    @Inject
    REITS_services reits_services;

    @Get(value = "/all-Test")
    public Object getAll(){

        Map<String, Object> map = new HashMap<>();
        map.put("data", new ArrayList<>());
        map.put("size", 0);
        map.put("Developver", "Yuzhen Chen");

        return map;
    }

    //@Get(value = "/dividends")
    @Get(value = "/{type}")
    public Object getAllDividens(String type){

        Map<String, Object> map = new HashMap<>();
        var data = type.equals("dividends") ? services.getDividendStocks() : services.getAll();
        map.put("data", data);
        map.put("size", data.size());  
        map.put("Developver", "Yuzhen Chen");
        System.out.println("Developer: Yuzhen Chen" );
        return map;
    }

    @Get(value = "/code/{code}")
    public Object getByCode(int code){

        Map<String, Object> map = new HashMap<>();
        var data = services.filter(code);
        map.put("data", data);
        map.put("size", data.size());
        
        return map;
    }

    @Get(value = "/reits")
    public Object getAllReits(){

        Map<String, Object> map = new HashMap<>();
        var data = reits_services.findAll();
        map.put("REITS_data", data);
        map.put("size", data.size());
        map.put("Developver", "Yuzhen Chen");
        
        return map;
    }

    @Get(value = "/reits/{symbol}")
    public Object getOneReits(String symbol){

        Map<String, Object> map = new HashMap<>();
        var data = reits_services.findOne(symbol);
        map.put("REITS_data", data);
        map.put("size", data.size());
        map.put("Developver", "Yuzhen Chen");
        
        return map;
    }
    
    @Get(value = "/etfs")
    public Object getEtfsAll(){

        Map<String, Object> map = new HashMap<>();
        var data = reits_services.findAll();
        map.put("REITS_data", data);
        map.put("size", data.size());
        map.put("Developver", "Yuzhen Chen");
        
        return map;
    }
        @Get(value = "/etfs/{symbol}")
    public Object getOneEtfs(String symbol){

        Map<String, Object> map = new HashMap<>();
        var data = reits_services.findOne(symbol);
        map.put("REITS_data", data);
        map.put("size", data.size());
        map.put("Developver", "Yuzhen Chen");
        
        return map;
    }
    
}
