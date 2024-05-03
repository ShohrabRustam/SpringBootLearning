package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
//		SpringApplication.run(HelloWorldApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
//		Sim sim = context.getBean(Jio.class);
//		sim.calling();
//		sim.data();
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = applicationContext.getBean("sim", Sim.class);
		sim.calling();
		sim.data();

	}

}
