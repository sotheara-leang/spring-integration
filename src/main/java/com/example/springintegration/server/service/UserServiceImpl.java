package com.example.springintegration.server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springintegration.server.domain.User;
import com.example.springintegration.server.persistence.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectUser(Long id) {
		return userMapper.selectUser(id);
	}
	
	@Override
	public int insertUser(User user) {
		return userMapper.insertUser(user);
	}

	@Override
	public int deleteUser(Long id) {
		int result = userMapper.deleteUser(id);
		
		//int error = 1/0;
		
		return result;
	}
}