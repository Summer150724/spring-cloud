/**
 * 文件名：Configuration.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-15 16:56
 * @description
 */
@Configuration
public class GatewayConfiguration {


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("service-2", r -> r.path("/china").uri("https://news.baidu.com/guonei")).build();
        return routes.build();
    }
}
