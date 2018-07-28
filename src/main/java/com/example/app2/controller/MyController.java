package com.example.app2.controller;

import com.example.app2.App2Application;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@Configuration
@RestController
public class MyController {

    static Logger log = Logger.getLogger(App2Application.class.getName());

    @Value("${endpoint.welcome}")
    private String mesaj;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String afiseazaMesajAppYML(){
        log.warning(mesaj);
        return mesaj;
    }

}
