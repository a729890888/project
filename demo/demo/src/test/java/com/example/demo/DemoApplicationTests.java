package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.Enum.USER;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserServiceImpl userService;

	@Test
	void contextLoads() {
		List<User> list = userMapper.selectList(null);
		list.forEach(item-> System.out.println(item));
	}

	@Test
	void test01(){
		userService.findAllUser();
	}

	@Test
	void test02(){
		System.out.println("用户ID打印：" + USER.id.name());
		QueryWrapper<User> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq(USER.id.name(), 1);
		List<User> list = userMapper.selectList(queryWrapper);
		list.toString();
	}

	@Test
	void test03(){
		
	}

}
