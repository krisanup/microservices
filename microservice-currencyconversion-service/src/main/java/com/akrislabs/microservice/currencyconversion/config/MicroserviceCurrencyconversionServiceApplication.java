package com.akrislabs.microservice.currencyconversion.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

 
 
@EnableFeignClients("com.akrislabs.microservice.currencyconversion.proxy")
@SpringBootApplication (scanBasePackages={"com.akrislabs.microservice.currencyconversion.controller"}) 
@EnableDiscoveryClient


public class MicroserviceCurrencyconversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCurrencyconversionServiceApplication.class, args);
	}
}
