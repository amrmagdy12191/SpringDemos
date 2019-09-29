package com.luv2code.springdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.entities.Account;

@Component
public class AccountDao {
	
	String service;
	String sale;

	public void addAcount(Account account) {
		System.out.println("I am going to add account");
	}

	public String getService() {
		System.out.println("getService");
		return service;
	}

	public void setService(String service) {
		System.out.println("setService");
		this.service = service;
	}

	public String getSale() {
		System.out.println("getSale");
		return sale;
	}

	public void setSale(String sale) {
		System.out.println("setSale");
		this.sale = sale;
	}
	
	
}
