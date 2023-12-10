package com.studentcurd.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentcurd.demo.entity.Student;
import com.studentcurd.demo.repository.StudentRepository;


@Service
public class StudentService {
	
	
	@Autowired
	private StudentRepository studentRepo;
	
	
	//create student 
	
	public Student createstudent(Student student) {
		
		Student save = studentRepo.save(student);
		
		return save;
		
	}
	
	
	//fetch all student
	
	public List<Student> allStudent(){
		
		List<Student> all = studentRepo.findAll();
		
		return all;
		
	}
	
	
	//fetch single student

	
	public Optional<Student> viewsingleStudent(int studentid) {
		
		Optional<Student> singlestudent = studentRepo.findById(studentid);
				
		return singlestudent;
		  
		
	}
	
	
	//delete student
	
	
	public void deleteStudent(int studentid) {
		
		studentRepo.deleteById(studentid);
		
	}
	
	
//update student
	
	
	public Student updateStudent(Student updatestudent,int studentid) {
		
		   Optional<Student> existingstudentoptional = studentRepo.findById(studentid);
		   
		
	        if (existingstudentoptional.isPresent()) {
	        	
	             Student  existingStudent = existingstudentoptional.get();
	             
	             existingStudent.setStudentname(updatestudent.getStudentname());
	             existingStudent.setStudentemail(updatestudent.getStudentemail());
	             existingStudent.setStudentaddress(updatestudent.getStudentaddress());
	                            
	             return studentRepo.save(existingStudent);
	             
	             
	        } else {
	            // Handle the case where no book is found with the given ID
	            throw new RuntimeException("Book not found with id: " + studentid);
	       }	   
		
	}
	
	
	
	

	
	

	
	
	
	
	

		
}
