package com.akrislabs.microservice.forex.microserviceforexservice.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication (scanBasePackages={"com.akrislabs.microservice.forex.microserviceforexservice.controller"}) 
@EntityScan("com.akrislabs.microservice.forex.microserviceforexservice.vo")
@EnableJpaRepositories("com.akrislabs.microservice.forex.microserviceforexservice.repo")
public class MicroserviceForexServiceApplication {
	
 
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceForexServiceApplication.class, args);
	}
}
