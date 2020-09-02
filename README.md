# cloud-gateway

Exploring Spring Cloud Gateway

## Route Configured
- `http://localhost:8080/get`
- `http://localhost:8080/api/payment-service`


## Route information via actuator endpoint
- `http://localhost:8080/actuator/gateway/routes/`
- `http://localhost:8080/actuator/gateway/routes/payment-service`
- `http://localhost:8080/actuator/gateway/routes/get`

## Start Application
- `mvn spring-boot:run`



## Reference
- [WebFilter Factories](https://www.baeldung.com/spring-cloud-gateway-webfilter-factories)
