/**
 * 文件名：ConsumeServiceImpl.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */
package com.example.module1.app.service.impl;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-04 12:27
 * @description
 */
public class ConsumeServiceImpl implements ConsumeService {
    @Override
    public Consume getConsume() {
        ChildConsume childConsume = new ChildConsume();
        childConsume.setI(1);
        childConsume.setJ(2);
        childConsume.setX(3);

        return childConsume;
    }
}
