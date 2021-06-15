/**
 * 文件名：OpenFeign.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.module1.infra.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-04 16:28
 * @description 测试openFeign日志
 */
@FeignClient(name = "WHATEVER")
public interface OpenFeign {

    @GetMapping
    void insert();
}
