package com.example.springintegration.server.service;

import com.example.springintegration.server.domain.User;

public interface UserService {
	
	User selectUser(Long id);
	
	int insertUser(User user);
	
	int deleteUser(Long id);
}
