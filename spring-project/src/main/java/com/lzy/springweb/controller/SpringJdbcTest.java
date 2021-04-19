package com.lzy.springweb.controller;

import com.lzy.springweb.dao.UserDao;
import com.lzy.springweb.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJdbcTest {
    public static void main(String[] args) {
        //创建Spring上下文（加载spring-config.xml）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        //获取Bean实例
        UserDao userMapper = (UserDao) applicationContext.getBean("userService");

        //调用实例方法
        User user = userMapper.getById(1);
        System.out.println(user.toString());
    }
}
