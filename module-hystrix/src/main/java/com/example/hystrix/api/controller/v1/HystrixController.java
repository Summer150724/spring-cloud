/**
 * 文件名：HystrixController.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.hystrix.api.controller.v1;

import com.example.hystrix.app.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-04 17:19
 * @description
 */
@RestController
@RequestMapping(value = "/hystrix")
public class HystrixController {

    @Resource
    private HystrixService hystrixService;

    @GetMapping("/normal")
    public String testNormal (Integer integer) {
        return hystrixService.normal(integer);
    }

    @GetMapping("/exception")
    public String testE (Integer integer) {
        return hystrixService.exception(integer);
    }
}
