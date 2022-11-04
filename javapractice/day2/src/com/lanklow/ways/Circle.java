package com.lanklow.ways;

/**
 * @Author: rongfahua
 * @Date: 2022/11/03/18:01
 * @Description:
 */
public class Circle {
    double radius;

    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
