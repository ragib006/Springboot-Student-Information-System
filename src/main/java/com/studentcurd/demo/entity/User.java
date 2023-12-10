package com.studentcurd.demo.entity;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.Cascade;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String useremail;
	private String useraddress;
	
	
	//@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	//Set<Role> role = new HashSet<>();
	
	
	public User() {
	
	}

	public User(int id, String username, String useremail, String useraddress) {
		super();
		this.id = id;
		this.username = username;
		this.useremail = useremail;
		this.useraddress = useraddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", useremail=" + useremail + ", useraddress=" + useraddress
				+ "]";
	}
	
	
	
	
	

}
