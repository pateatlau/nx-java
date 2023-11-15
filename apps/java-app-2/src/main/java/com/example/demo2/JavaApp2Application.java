package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class JavaApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaApp2Application.class, args);
		System.out.println("Hello Java2!!");
	}

		@GetMapping("/items")
  public String hello() {
    return "App2";
  }

}
