package com.rs.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class EndPointController {

    @GetMapping("/fallback")
    public Mono<String> fallback() {
        return Mono.just("Fall Back Content\n");

    }
  

}
