/**
 * 文件名：HystrixServiceImpl.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.hystrix.app.service.impl;

import com.example.hystrix.app.service.HystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-04 17:16
 * @description
 */
@Service
// 没有特别配置@HystrixCommand的就会走默认的
@DefaultProperties(defaultFallback = "exceptionHandle")
public class HystrixServiceImpl implements HystrixService {


    public String normal(Integer id) {
        return "normal";
    }

    @HystrixCommand(fallbackMethod = "exceptionHandle", commandProperties = {
            @HystrixProperty(name= "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String exception(Integer id) {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "exception";
    }

    public String exceptionHandle(Integer id) {
        return "exceptionHandle";
    }
}
