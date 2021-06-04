/**
 * 文件名：Module1Configuration.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.module1.configuration;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-02 17:12
 * @description
 */
@Configuration
public class Module1Configuration {


    @Bean
    // 开启负载均衡
    @LoadBalanced
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }
}
