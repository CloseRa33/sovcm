package com.example.SovcomEmailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SovcomEmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SovcomEmailServiceApplication.class, args);
	}

}
