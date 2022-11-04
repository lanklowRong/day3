package com.lanklow.ways;

/**
 * @Author: rongfahua
 * @Date: 2022/11/03/17:43
 * @Description:
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.age=10;
        person.name="tom";
        person.sex=1;

        person.study();
        person.addAge(100);
        person.showAge();
    }
}
