/**
 * 文件名：Module1Controller.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.module1.api.controller.v1;

import com.example.coomon.utils.CommonUtil;
import com.example.module1.app.service.impl.Consume;
import com.example.module1.app.service.impl.ConsumeService;
import com.example.module1.app.service.impl.ConsumeServiceImpl;
import com.example.module1.infra.feign.OpenFeign;
import com.example.module1.infra.feign.SpringBootDemoRemoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-02 17:19
 * @description
 */
@RestController("Module1Controller")
@RequestMapping("/module1")
public class Module1Controller {

    @Autowired
    private SpringBootDemoRemoteService springBootDemoRemoteService;
    @Autowired
    private OpenFeign openFeign;


    @GetMapping
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok(springBootDemoRemoteService.feign());
    }
    @GetMapping("/consume")
    public ResponseEntity<Consume> getConsume() {
        ConsumeService consumeService = new ConsumeServiceImpl();
        // openFeign.insert();
        return ResponseEntity.ok(consumeService.getConsume());
    }
}
