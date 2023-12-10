package com.studentcurd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.studentcurd.demo.entity.User;

import com.studentcurd.demo.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userservice;
	
	
	//create student
	@PostMapping("/createuser")
	public User saveuser(@RequestBody User user) {
		
		User save = userservice.createuser(user);
		 
		 return save;
		
	}
	
	
  //fetch all student 
	
	
	@GetMapping("/alluser")
	public List<User> displayalluser(){
		
		List<User> all = userservice.allUser();
		
		return all;
		
	}

}
