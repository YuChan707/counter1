package edu.citytech.counter.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.citytech.counter.services.EnergyStockService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/stocks")
public class EnergyStockController {
    @Inject
    EnergyStockService services;

    @Get(value = "/all")
    public Object getAll(){

        Map<String, Object> map = new HashMap<>();
        map.put("data", new ArrayList<>());
        map.put("size", 0);

        return map;
    }

    @Get(value = "/dividends")
    public Object getAllDividens(){

        Map<String, Object> map = new HashMap<>();
        var data = services.getDividendStocks();
        map.put("data", data);
        map.put("size", data.size());
        
        return map;
    }
}
