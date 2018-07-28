package com.example.app2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
public class MyController {

    @Value("${endpoint.welcome}")
    private String mesaj;


    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String afiseazaMesajAppYML(){
        return mesaj;
    }

}
