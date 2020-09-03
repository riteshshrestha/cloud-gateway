package com.rs.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig {

    /**
     * Java based routing with builder
     * @param builder
     * @return
     * route to http://httpbin.org/get
     *
     * curl --dump-header - --header 'Host: www.hystrix.com' http://localhost:8080/delay/3
     */

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().route(p -> p.path("/get-test")
                .filters(f->f.addRequestHeader("hello","world"))
                .uri("http://httpbin.org:80"))
                //Hystrix circuit breaker
                .route(p -> p
                        .host("*.hystrix.com")
                        .filters(f-> f.hystrix(config -> config
                                .setName("myCmd")
                                // uri=fallback
                                .setFallbackUri("forward:/fallback")))
                        .uri("http://httpbin.org:80"))
                        .build();
    }



}
