package com.example.demo.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Enum.USER;
import com.example.demo.anotation.MyAnotation;
import com.example.demo.entity.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@MyAnotation(value = "", name = "", num = 1)//自定义注解
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    /**
     * MybatisPlus内置方法调用
     * @return
     */
    @RequestMapping("/selectList")
    @MyAnotation(value = "", name = "", num = 1)//自定义注解
    public List<User> selectList(){
        return userService.list();
    }

    /**
     * 自定义方法调用
     * @return
     */
    @RequestMapping(value = "/findAllUser")
    public List<User> findAllUser(){
        return userService.findAllUser();
    }

    /**
     * 自定义方法调用
     * @return
     */
    @RequestMapping("/totalCoutUser")
    public int totalCoutUser(){
        return userService.totalCount();
    }

    /**
     * 条件构造器方法
     * @return
     */
    @RequestMapping("/queryWrapperList")
    public List<User> queryWrapperList(){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(USER.id.name(), "1");
        return userService.queryWrapperList();
    }
}
