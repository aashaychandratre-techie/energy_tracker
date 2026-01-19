package com.aashay.ingetion_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class IngetionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IngetionServiceApplication.class, args);
	}

}
