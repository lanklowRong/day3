package com.lanklow.ways;

/**
 * @Author: rongfahua
 * @Date: 2022/11/03/17:43
 * @Description:
 */
public class Person {
    String name;
    int age;
    /**
     * sex为1是男*
     * sex为0是女*
     */
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("age:"+age);

    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}
