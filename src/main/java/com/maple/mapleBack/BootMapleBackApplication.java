package com.maple.mapleBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootMapleBackApplication {

	public static void main(String[] args) {
        System.out.println("### Active Profile: " + System.getProperty("spring.profiles.active"));
		SpringApplication.run(BootMapleBackApplication.class, args);
	}

}
