package com.example.starbucksservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class StarbucksServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarbucksServiceApplication.class, args);
	}

}
