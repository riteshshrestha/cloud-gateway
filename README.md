[![CircleCI](https://circleci.com/gh/riteshshrestha/cloud-gateway.svg?style=shield)](https://circleci.com/gh/riteshshrestha/cloud-gateway)

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

## Some Description

Routes define how the Gateway will process incoming request
Each Route is composed of Predicates, Filters and a URI

Predicates determine whether the Route matches any given request
Filters apply behavior to matching requests or their responses
The URI determines where the request will be forwarded after filtering`


## Reference
- [WebFilter Factories](https://www.baeldung.com/spring-cloud-gateway-webfilter-factories)
