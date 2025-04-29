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
}
