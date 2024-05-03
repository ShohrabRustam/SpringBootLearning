package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {
    
    @Override public void calling()
    {
        System.out.println("Jio Calling");
    }
 
    @Override public void data()
    {
        System.out.println("Jio Data");
    }
}
