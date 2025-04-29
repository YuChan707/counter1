package edu.citytech.counter.controller;


import edu.citytech.counter.services.ABC_Services;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;

@Controller("/abc")
public class ABC_Controller {

    @Inject ABC_Services services;

    @Get(uri="a")
    public Object ABC_wow() { 
        return services.get_abc() ;
    }

    @Get(uri = "v")
    public Object DisplayVowelL() { 
        return services.getVowelsLower();
    }

    
    @Get(uri = "V")
    public Object DisplayVowelU() { 
        return services.getVowelsUpper();
    }

    
    @Get(uri = "A")
    public Object DisplayABC() { 
        return services.get_ABC();
    }
}
