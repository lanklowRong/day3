package com.lanklow.java;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @Author: rongfahua
 * @Date: 2022/11/04/11:53
 * @Description:
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object object = new Object();
        object.setName("xiaojiba");
        object.setSex("yigezhenzhnegdeman");
        object.setAge(20);
        System.out.println(object.getName());
        object.eat();
    }
}
