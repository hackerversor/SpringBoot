package com.example.demo.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

public class LoginService {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/getUser")
	public User getUser(Long id) {
		User user = userMapper.getOne(id);
		return user;
	}
}
