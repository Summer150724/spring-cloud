/**
 * 文件名：DynamicConfigController.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.api.controller.v1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-18 17:22
 * @description
 */
@RestController
// 实现配置自动更新
@RefreshScope
public class DynamicConfigController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/server-port")
    public String getRefresh() {

        return serverPort;
    }
}
