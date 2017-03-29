package com.example.springintegration.server.persistence;

import org.springframework.stereotype.Repository;

import com.example.springintegration.server.domain.User;

@Repository
public interface UserMapper {
	
	User selectUser(Long id);

	int insertUser(User user);
	
	int deleteUser(Long id);
}
