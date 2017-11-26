package com.edsd.samp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsd.samp.model.Person;

@RestController
public class TestController {

    @RequestMapping("/test")
    Person test(){
        return new Person("Ethien Salinas", 33);
    }

}