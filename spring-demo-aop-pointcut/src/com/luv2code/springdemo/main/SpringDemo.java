package com.luv2code.springdemo.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.SpringConfig;
import com.luv2code.springdemo.dao.AccountDao;
import com.luv2code.springdemo.dao.CustomerDao;
import com.luv2code.springdemo.entities.Account;

public class SpringDemo {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		AccountDao accountDao = context.getBean(AccountDao.class);
		CustomerDao customerDao = context.getBean(CustomerDao.class);
		
		Account account = new Account();
		account.setId(1);
		account.setName("Amr");
		account.setEmail("myMail@gmail.com");
		accountDao.setService("service");
		accountDao.setSale("sale");
		accountDao.getSale();
		accountDao.getService();
		accountDao.addAcount(account);
		
		customerDao.addAcount();
		customerDao.addCustomer();
		customerDao.addCustomer("test", 1);
		
		context.close();
	}

}
