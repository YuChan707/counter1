package edu.citytech.counter.controller;


import edu.citytech.counter.services.ABC_Services;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/abc")
public class ABC_Controller {

    @Get()
    public Object ABC_wow() { 
        return new ABC_Services().get_abc() ;
    }

    @Get(uri = "v")
    public Object DisplayVowelL() { 
        return new ABC_Services().getVowelsLower();
    }

    
    @Get(uri = "V")
    public Object DisplayVowelU() { 
        return new ABC_Services().getVowelsUper();
    }

    
    @Get(uri = "A")
    public Object DisplayABC() { 
        return new ABC_Services().get_ABC();
    }
}
