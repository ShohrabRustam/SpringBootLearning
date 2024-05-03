package com.example.demo;

import org.springframework.stereotype.Component;

// Class
// Implementing Sim interface
@Component
public class Airtel implements Sim {
 
    @Override public void calling()
    {
        System.out.println("Airtel Calling");
    }
 
    @Override public void data()
    {
        System.out.println("Airtel Data");
    }
}