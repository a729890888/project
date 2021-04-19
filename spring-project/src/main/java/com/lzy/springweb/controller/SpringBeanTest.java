package com.lzy.springweb.controller;

import com.lzy.springweb.entity.Book;
import com.lzy.springweb.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;
import java.util.Date;


public class SpringBeanTest {
    static Logger logger = LoggerFactory.getLogger(SpringBeanTest.class);

    public static void main(String[] args) {
        Long t1 = new Date().getTime();
        Long t2 = System.currentTimeMillis();
        Long t3 = Calendar.getInstance().getTimeInMillis();
        //日志
        logger.info("日志打印启动1:{}|2:{}|3{}", t1, t2, t3);

        //创建Spring上下文（加载spring-config.xml）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        //获取Bean实例
        User user = applicationContext.getBean("user", User.class);

        //调用User方法toString()
        System.out.println(user.toString());

        //获取Book实例
        Book book = applicationContext.getBean("book", Book.class);

        //赋值
        book.setId(1);
        book.setName("三国演义");

        //打印(比较scope属性)
        System.out.println(book.toString());
        System.out.println(book.hashCode());//打印hashCode

        //获取新实例
        Book newBook = applicationContext.getBean("book", Book.class);

        //打印(比较scope属性)
        System.out.println(newBook.toString());
        System.out.println(newBook.hashCode());//打印hashCode

        //销毁关闭
        ((ClassPathXmlApplicationContext)applicationContext).close();

    }
}
