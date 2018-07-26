# microservices
This is a sample app to understand microservices

Added Forex microservice - which runs on 8000 - it uses H2 DB 
Added Currency Exchange service , which uses feign that uses Ribbon to call Forex vai Eureka
Added Eureka Server 

Note: the Ribbon with a configured list of Forex microservice works fine but Ribbon is not able to call Forex via Eureka.
      A 400 error is popped up. Not yet resolved.
