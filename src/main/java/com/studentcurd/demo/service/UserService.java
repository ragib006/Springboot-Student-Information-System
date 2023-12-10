package com.studentcurd.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcurd.demo.entity.User;

import com.studentcurd.demo.repository.UserRepository;

@Service
public class UserService {
	
	
	
	
	@Autowired
	private UserRepository userRepo;
	
	
	//create student 
	
	public User createuser(User user) {
		
		User save = userRepo.save(user);
		
		return save;
		
	}
	
	
	//fetch all student
	
	public List<User> allUser(){
		
		List<User> all = userRepo.findAll();
		
		return all;
		
	}
	
	
	
	
	
	
	

}
