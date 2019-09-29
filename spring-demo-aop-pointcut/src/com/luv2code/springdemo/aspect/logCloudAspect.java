package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class logCloudAspect {
	
	@Before("com.luv2code.springdemo.aspect.luvExpressions.forDaoPackage()")
	public void logCloud() {
		System.out.println("=======> logCloud");
	}
}
