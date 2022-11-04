package com.lanklow.ex;

/**
 * @Author: rongfahua
 * @Date: 2022/11/01/13:57
 * @Description:
 */
public class ArrayEx2 {
    public static void main(String[] args) {
        int [] array1,array2;

        array1 = new int[]{2,3,4,6,5,41,56,74};

        array2 = array1;
        for (int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
    }
}
