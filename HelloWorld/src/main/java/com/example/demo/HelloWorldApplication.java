package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
		Sim sim = context.getBean(Jio.class);

//		 Sim sim = new Jio();
//         Sim sim = new Airtel();
         sim.calling();
//         sim.data();
		System.out.println("Running: ");
	}

}
