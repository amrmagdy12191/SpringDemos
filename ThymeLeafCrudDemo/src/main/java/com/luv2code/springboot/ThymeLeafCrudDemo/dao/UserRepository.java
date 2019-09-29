package com.luv2code.springboot.ThymeLeafCrudDemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.ThymeLeafCrudDemo.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findAllByOrderByNameAsc();
	
}

