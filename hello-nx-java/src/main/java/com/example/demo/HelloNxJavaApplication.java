package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloNxJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloNxJavaApplication.class, args);
		System.out.println("Hello Java");
	}

}
