package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Utils;

@SpringBootApplication
@RestController
public class JavaApp3Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaApp3Application.class, args);
		System.out.println("Hello Java3!!!");
	}

	@GetMapping("/items")
  public String hello() {
    return Utils.getName();
  }

}

