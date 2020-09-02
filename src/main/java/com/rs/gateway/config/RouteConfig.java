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
     */

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().route(p -> p.path("/get-test").filters(f->f.addRequestHeader("hello","world")).uri("http://httpbin.org:80")).build();
    }
}
