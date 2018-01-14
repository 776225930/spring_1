package com.example.spring.beans.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.spring.beans.annotation.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	 @Qualifier("userJdbcReposityImpl")
	 private UserRepository userRepository;
	
	 public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
     public void add(){
    	 System.out.println("UserService add...");
         userRepository.save();
     }
}
