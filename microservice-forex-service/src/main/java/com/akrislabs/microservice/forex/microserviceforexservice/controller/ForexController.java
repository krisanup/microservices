package com.akrislabs.microservice.forex.microserviceforexservice.controller;
 

import com.akrislabs.microservice.forex.microserviceforexservice.vo.ExchangeValue;
import com.akrislabs.microservice.forex.microserviceforexservice.repo.ExchangeValueRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.env.Environment;


@RestController
@EnableAutoConfiguration
public class ForexController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
  private ExchangeValueRepository repository;
  
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue
    (@PathVariable String from, @PathVariable String to){
    
    ExchangeValue exchangeValue = 
        repository.findByFromAndTo(from, to);
    
    exchangeValue.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    
    return exchangeValue;
  }
}