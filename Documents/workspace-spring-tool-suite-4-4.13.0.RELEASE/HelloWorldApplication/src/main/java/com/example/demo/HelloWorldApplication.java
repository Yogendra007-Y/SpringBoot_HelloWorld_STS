package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {
	/*
	 * @SpringBootApplication:describs the start of spring project And print hello message
	 */
	public static void main(String[] args) {
		System.out.println("Hello from BridgeLabz");
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}