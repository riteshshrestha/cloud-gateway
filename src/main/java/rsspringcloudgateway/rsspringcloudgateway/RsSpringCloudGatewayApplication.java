package rsspringcloudgateway.rsspringcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RsSpringCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(RsSpringCloudGatewayApplication.class, args);
    }

    /**
     * Java based routing with builder
     * @param builder
     * @return
     * route to http://httpbin.org/get
     */

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes().route(p -> p.path("/get").filters(f->f.addRequestHeader("hello","world")).uri("http://httpbin.org:80")).build();
    }

}
