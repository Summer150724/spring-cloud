package com.example.coomon.utils; /**
 * 文件名：com.example.coomon.utils.CommonUtil.java
 * 版权： Copyright 2019-2024 XIA.FENG All Rights Reserved.
 * 描述：AUTHOR_XIAFENG
 */


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xia.feng@hand-china.com
 * @version 0.1
 * @date 2021-06-03 13:50
 * @description
 */
public class CommonUtil {

    public static final DateFormat dateFormat = SimpleDateFormat.getInstance();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(null);
        int i = list.get(0);
    }

}
