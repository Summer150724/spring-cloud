package com.example.module1; /**
 * 文件名：com.example.module1.Module1Application.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-02 16:48
 * @description
 */
@EnableFeignClients
@ComponentScan(
        // basePackages = {"com.example.springbootdemo"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = {"com.example.springbootdemo.rocket_mq.*", "com.example.springbootdemo.redis.*"}))
@SpringBootApplication
public class ServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }
}
