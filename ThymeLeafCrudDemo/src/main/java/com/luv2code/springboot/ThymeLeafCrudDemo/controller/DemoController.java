package com.luv2code.springboot.ThymeLeafCrudDemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springboot.ThymeLeafCrudDemo.dao.UserRepository;
import com.luv2code.springboot.ThymeLeafCrudDemo.entities.User;
import com.luv2code.springboot.ThymeLeafCrudDemo.service.UserService;

@Controller
@RequestMapping("/user")
public class DemoController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/test")
	public String hello(Model model){
		model.addAttribute("date", new Date());
		return "helloworld";
	}
	
	@GetMapping("/")
	public String findAll(Model model){
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "usersList";
	}
	
	@GetMapping("/showAddForm")
	public String showAddForm(Model model){
		model.addAttribute("user", new User());
		return "user-form";
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute User user){
		userService.save(user);
		return "redirect:/user/";
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam int id ){
		userService.delete(id); 
		return "redirect:/user/";
	}
	
	@PostMapping("/showUpdateForm")
	public String showUpdateForm(@RequestParam int id, Model model){
		User user = userService.findById(id);
		model.addAttribute("user", user);
		return "user-form";
	}

		

}
