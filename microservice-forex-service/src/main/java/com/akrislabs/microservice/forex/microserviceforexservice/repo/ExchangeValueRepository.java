package com.akrislabs.microservice.forex.microserviceforexservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.akrislabs.microservice.forex.microserviceforexservice.vo.ExchangeValue;
@Repository
@Transactional
public interface ExchangeValueRepository extends 
    JpaRepository<ExchangeValue, Long>{
  ExchangeValue findByFromAndTo(String from, String to); 
}