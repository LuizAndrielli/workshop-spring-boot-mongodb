package com.nelioalves.workhopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workhopmongo.domain.User;
import com.nelioalves.workhopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;  
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
