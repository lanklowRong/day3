package com.lanklow.java;

/**
 * @Author: rongfahua
 * @Date: 2022/11/01/15:39
 * @Description:
 */
public class OOPTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setMale("male");
        customer.setAge(10);
        customer.talk();

    }
}
class Customer{
    public String name;
    int age;
    String isMale;


    public void talk(){
        setName();
        System.out.println(name+"说了：我是你爹,你才"+age+"岁"+isMale+"我的儿子");

    }

    public void setName() {
        this.name = "father";
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setMale(String isMale){
        this.isMale=isMale;
    }


}