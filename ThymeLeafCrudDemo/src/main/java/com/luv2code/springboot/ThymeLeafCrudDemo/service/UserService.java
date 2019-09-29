package com.luv2code.springboot.ThymeLeafCrudDemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springboot.ThymeLeafCrudDemo.dao.UserRepository;
import com.luv2code.springboot.ThymeLeafCrudDemo.entities.User;

@Service
public class UserService {
	
	private UserRepository userRepository;
	
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Transactional
	public List<User> findAll(){
		
		return userRepository.findAllByOrderByNameAsc();	
	}
	
	@Transactional
	public User findById(int theId) {
		Optional<User> result = userRepository.findById(theId);
		
		User user = null;
		
		if (result.isPresent()) {
			user = result.get();
		}
		else {
			// we didn't find the employee
			throw new RuntimeException("Did not find user id - " + theId);
		}
		
		return user;
	}
	
	@Transactional
	public void save(User user){
		userRepository.save(user);
	}
	
	@Transactional
	public void delete(int user){
		userRepository.deleteById(user);
	}
}
