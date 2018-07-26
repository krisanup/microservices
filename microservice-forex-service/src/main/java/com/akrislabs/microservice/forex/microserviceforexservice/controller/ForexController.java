package com.akrislabs.microservice.forex.microserviceforexservice.controller;
 

import com.akrislabs.microservice.forex.microserviceforexservice.vo.ExchangeValue;
import com.akrislabs.microservice.forex.microserviceforexservice.repo.ExchangeValueRepository; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.math.BigDecimal;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static java.lang.String.format;

@RestController  
public class ForexController {
  
  @Autowired
  private Environment environment;
  
  @Autowired
   private ExchangeValueRepository repository;
    
  @GetMapping("/currency-exchange/from/{from}/to/{to}")
  public ExchangeValue retrieveExchangeValue
    (@PathVariable String from, @PathVariable String to){
    
    ExchangeValue exchangeValue =  repository.findByFromAndTo(from, to);
    System.out.println("exchangeValue"+exchangeValue);
    exchangeValue.setPort(
        Integer.parseInt(environment.getProperty("local.server.port")));
    
    return exchangeValue;
  }
  @RequestMapping(value = "/hello/{firstName}/{lastName}", method = GET)
    public String hello(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName) {
	   
        return format("{\"message\":\"Hello %s %s\"}", firstName, lastName);
    }
}