package com.studentcurd.demo.entity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollId;
	private String roleName;
	
	//@ManyToMany(mappedBy = "role")
	//Set<User> user = new HashSet<>();
	
	
	
	
	
	public Role() {
		
	}


	public Role(int rollId, String roleName) {
		super();
		this.rollId = rollId;
		this.roleName = roleName;
	}


	public int getRollId() {
		return rollId;
	}


	public void setRollId(int rollId) {
		this.rollId = rollId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	@Override
	public String toString() {
		return "Role [rollId=" + rollId + ", roleName=" + roleName + "]";
	}
	
	
	
	
	
	

}
