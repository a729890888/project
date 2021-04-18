package com.example.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.Enum.USER;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        List<User> list = userMapper.findAllUser();
        return list;
    }

    @Override
    public int totalCount() {
        return userMapper.totalCount();
    }

    @Override
    public List<User> queryWrapperList() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(USER.id.name(), 1);
        List<User> list = userMapper.selectList(queryWrapper);
        return list;
    }
}
