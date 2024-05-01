package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class AppConfiguration {
    @RequestMapping("/hello")
    public String hello(){
        return  "Hello World";
    }

}
