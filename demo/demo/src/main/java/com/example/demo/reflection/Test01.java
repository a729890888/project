package com.example.demo.reflection;

import com.example.demo.entity.User;

/**
 * java发射的三种方式
 */
public class Test01 {
    public static void main(String[] args) {
        try {
            //方式一
            Class c1 = Class.forName("com.example.demo.entity.User");
            //方式二
            Class c2 = User.class;
            //方式三
            User user = new User();
            Class c3 = user.getClass();
            //打印
            System.out.println(c1.getName() + "|hashCode=" + String.valueOf(c1.hashCode()));
            System.out.println(c2.getName() + "|hashCode=" + String.valueOf(c2.hashCode()));
            System.out.println(c3.getName() + "|hashCode=" + String.valueOf(c2.hashCode()));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
