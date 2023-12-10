package com.studentcurd.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int studentid;
	private String studentname;
	private String studentemail;
	private String studentaddress;
	
	public Student() {
		
	}

	public Student(int studentid, String studentname, String studentemail, String studentaddress) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentemail = studentemail;
		this.studentaddress = studentaddress;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentemail() {
		return studentemail;
	}

	public void setStudentemail(String studentemail) {
		this.studentemail = studentemail;
	}

	public String getStudentaddress() {
		return studentaddress;
	}

	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
		
		
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentemail=" + studentemail
				+ ", studentaddress=" + studentaddress + "]";
	}
	
	
	
	
	

}
