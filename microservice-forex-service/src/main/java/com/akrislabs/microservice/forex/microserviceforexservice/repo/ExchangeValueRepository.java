package com.akrislabs.microservice.forex.microserviceforexservice.repo;

import org.springframework.data.jpa.repository.JpaRepository; 

import com.akrislabs.microservice.forex.microserviceforexservice.vo.ExchangeValue;
import org.springframework.stereotype.Repository;


@Repository  
public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to); 
}