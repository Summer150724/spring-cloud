/**
 * 文件名：SpringBootDemoRemoteService.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.module1.infra.feign;

import org.springframework.boot.autoconfigure.sendgrid.SendGridProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Proxy;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-02 17:11
 * @description
 */
@Service
public class SpringBootDemoRemoteService {

    private RestTemplate restTemplate;

    public SpringBootDemoRemoteService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String feign () {
        ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:8090/mybatis/test/haha", String.class);
        System.out.println(entity);
        return entity.getBody();
    }
}
