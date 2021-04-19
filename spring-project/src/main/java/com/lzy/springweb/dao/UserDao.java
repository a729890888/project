package com.lzy.springweb.dao;

import com.lzy.springweb.entity.User;

public interface UserDao {
    //获取用户
    User getById(int id);
}
