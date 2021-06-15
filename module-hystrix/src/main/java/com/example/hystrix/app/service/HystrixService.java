/**
 * 文件名：HystrixService.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.hystrix.app.service;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-04 17:15
 * @description
 */
public interface HystrixService {

    String normal(Integer id);

    String exception(Integer id);
}
