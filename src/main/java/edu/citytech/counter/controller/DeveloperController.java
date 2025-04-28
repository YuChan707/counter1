package edu.citytech.counter.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.Date;

import edu.citytech.counter.dto.Developer;
@Controller()
public class DeveloperController {
    @Get()
    public String Developer() { 
        return "Chen, Yuzhen " + new Date() ;
    }
    
    @Get(uri = "developer")
    @Produces(MediaType.APPLICATION_JSON)
    public Object detailDeveloper() {         
        String name = "Chen, Yuzhen ";
        String[] skills = {"SQL","Java", "HTML" , "Javascript"};
        var developer = new Developer(name,skills, 20);
        return developer;
    }
        
}
