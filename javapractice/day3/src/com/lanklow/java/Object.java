package com.lanklow.java;

/**
 * @Author: rongfahua
 * @Date: 2022/11/04/11:52
 * @Description:
 */
public class Object {
    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("chi坤吧");

    }

    public void Do(){
        System.out.println("ni mei ji ji");

    }

    public int addAge(int i){
        age += i;
        return age;

    }
}
