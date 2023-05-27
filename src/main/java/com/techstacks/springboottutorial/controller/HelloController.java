package com.techstacks.springboottutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {
    @Value("${welcome.message}")
    private String welcomeMesage;

    @GetMapping("/get")
    public String helloworld(){
        return welcomeMesage;
    }
}

