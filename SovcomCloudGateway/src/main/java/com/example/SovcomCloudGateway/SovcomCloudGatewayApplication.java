package com.example.SovcomCloudGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SovcomCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SovcomCloudGatewayApplication.class, args);
	}

}
