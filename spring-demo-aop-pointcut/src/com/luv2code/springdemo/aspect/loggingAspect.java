package com.luv2code.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.entities.Account;

@Aspect
@Component
@Order(2)
public class loggingAspect {
	
	@Before("com.luv2code.springdemo.aspect.luvExpressions.forDaoPackage()")
	public void logMessages(JoinPoint joinPoint){
		System.out.println("=======> logMessages");
		MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
		System.out.println(methodSignature);
		
		Object[]args = joinPoint.getArgs();
		for (Object object : args) {
			if(object instanceof Account){
				Account account = (Account) object;
				System.out.println("id = " + account.getId());
				System.out.println("name = " + account.getName());
				System.out.println("email = " + account.getEmail());
			}else{
				System.out.println(object);
			}
		}
	}
}
