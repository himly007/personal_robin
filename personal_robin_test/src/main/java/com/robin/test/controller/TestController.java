package com.robin.test.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/robin_test")
    public String testRequest(){
        return "testString...";
    }
}
