package com.luv2code.springdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CustomerDao {
	
	public String addCustomer() {
		System.out.println(" i am going to add Customer");
		return "";
	}
	
	public Integer addCustomer(String customername, int i) {
		System.out.println(" i am going to add Customer : " + customername);
		return 0;
	}
	
	public void addAcount() {
		System.out.println("CustomerDao : I am going to add account");
	}
	
	
}
