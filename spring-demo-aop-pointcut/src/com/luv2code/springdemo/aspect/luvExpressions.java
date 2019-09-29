package com.luv2code.springdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class luvExpressions {
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.*(..))")
	public void logPointCut() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.set*(..))")
	public void setter() {}
	
	@Pointcut("execution(* com.luv2code.springdemo.dao.*.get*(..))")
	public void getter() {}
	
	@Pointcut("logPointCut() && !(setter() || getter())")
	public void forDaoPackage() {}
}
