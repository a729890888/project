package com.example.demo.reflection;

/**
 * 类加载器
 */
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //加载器父类
        ClassLoader parentLoader = classLoader.getParent();
        System.out.println(parentLoader);

        //根加载器（加载器父类的父类）
        ClassLoader parent1 = parentLoader.getParent();
        System.out.println(parent1);

        //当前类用的加载器
        ClassLoader currentLoader = Class.forName("com.example.demo.reflection.Test02").getClassLoader();
        System.out.println(currentLoader);

        //Object用的加载器
        ClassLoader objectLoader = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(objectLoader);

        //系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
