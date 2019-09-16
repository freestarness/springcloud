package com.demo.apigateway.router;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zh-ma
 * Date 2019/7/3 ${Time}
 */
@Configuration
public class CustomRouteLocator {
    @Bean
    public RouteLocator CustomRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("path_route", r -> r.path("/user/**")
                        .uri("lb://USER-SERVICE"))
                .route("1111", r -> r.path("/baidu")
                        .uri("http://www.baidu.com"))
                .build();
    }
}
