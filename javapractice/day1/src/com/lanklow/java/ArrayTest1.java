package com.lanklow.java;

import jdk.nashorn.internal.parser.JSONParser;

/**
 * @Author: rongfahua
 * @Date: 2022/11/01/13:45
 * @Description:
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        int [] arr= new int[10];

        for (int i = 0;i< arr.length;i++){
            arr[i] = (int)(Math.random()*(99-10+1)+10);
        }
        //遍历
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //求数组最大值
        int maxValue = arr[0];
        for (int i = 1;i<arr.length;i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("最大值为："+maxValue);

        //求最小值
        int minValue = arr[0];
        for (int i = 1;i<arr.length;i++) {
            if (maxValue > arr[i]) {
                maxValue = arr[i];
            }
        }
        System.out.println("最小值为："+minValue);

        //求总和
        int sum=0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }

        //求平均值
        int avg =sum/10;
    }
}
