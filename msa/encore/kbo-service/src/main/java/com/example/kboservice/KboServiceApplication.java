package com.example.kboservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class KboServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(KboServiceApplication.class, args);
	}

}
