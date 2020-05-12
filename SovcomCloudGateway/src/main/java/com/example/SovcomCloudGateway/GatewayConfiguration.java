package com.example.SovcomCloudGateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/email/**")
                        .uri("lb://EMAIL-SERVICE")
                        .id("emailNotification"))
                .route(r -> r.path("/push/**")
                        .uri("lb://PUSH-SERVICE")
                        .id("pushNotification"))
                .route(r -> r.path("/sms/**")
                        .uri("lb://SMS-SERVICE")
                        .id("smsNotification"))
                .build();
    }
}
