package com.studentcurd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentcurd.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
