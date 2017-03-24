package com.example.springintegration.server.persistence;

import org.springframework.stereotype.Repository;

import com.example.springintegration.server.domain.User;

@Repository
public interface UserMapper {

	int insertUser(User user);
	
	int deleteUser(User user);
}
