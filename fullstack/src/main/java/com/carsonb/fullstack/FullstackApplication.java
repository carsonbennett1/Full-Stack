package com.carsonb.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// @ == annotation
// @ComponentScan --> Scope of where Sprinboot will look for other files
// @Controller (MVC controller) --> Request handling methods 

@SpringBootApplication
@ComponentScan("com.carsonb")
public class FullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
		System.out.println("Hello World!");
	}

}
