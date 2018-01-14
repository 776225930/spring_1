package com.example.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcReposityImpl implements UserRepository{

	@Override
	public void save() {
            System.out.println("UserJdbcReposityImpl save...");		
	}
        
}
