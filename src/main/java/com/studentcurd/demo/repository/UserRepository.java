package com.studentcurd.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentcurd.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
