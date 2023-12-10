package com.studentcurd.demo.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studentcurd.demo.entity.Student;
import com.studentcurd.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	
	@Autowired
	private StudentService studentservice;
	
	
	//create student
	@PostMapping("/cretestudent")
	public Student savestudent(@RequestBody Student student) {
		
		 Student save = studentservice.createstudent(student);
		 
		 return save;
		
	}
	
	
  //fetch all student 
	
	
	@GetMapping("/allstudent")
	public List<Student> displayallbook(){
		
		List<Student> all = studentservice.allStudent();
		
		return all;
		
	}
	
	
	//fetch single student  
	
	
	@GetMapping("/singlestudent/{studentid}")
	
	public Optional<Student> displaysinglestudent(@PathVariable int studentid) {
		
		Optional<Student> single = studentservice.viewsingleStudent(studentid);
		
		return single;
		
	}
	
	
	//delete student  
	
	
	
    @DeleteMapping("/deletestudent/{studentid}")

    public void deletestudent(@PathVariable int studentid) {
	
    	studentservice.deleteStudent(studentid);
	
    }

	
    //update student  
    
    
    @PutMapping("/updatestudent/{studentid}")
    
    public Student updatestudentmethod(@RequestBody Student updatestudent,@PathVariable int studentid) {
    	
    	Student update = studentservice.updateStudent(updatestudent,studentid);
    	
    	return update;
    	
    	
    }
	
	
	
	

}
