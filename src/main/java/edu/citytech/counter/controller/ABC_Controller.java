package edu.citytech.counter.controller;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/abc")
public class ABC_Controller {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";

    @Get()
    public Object ABC() { 
        return ABC.split("") ;
    }
}
