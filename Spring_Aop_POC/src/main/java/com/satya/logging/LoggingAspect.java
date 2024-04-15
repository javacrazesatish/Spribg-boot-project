package com.satya.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
//	@Before("execution(* com.satya.controller.*.*(..))")
//	public void logControllerMethod() {
//		System.out.println("Logging before controller method execution....!");
//	}
//	
//	@After("execution(* com.satya.controller.*.*(..))")
//	public void logControllerAfeterMethod() {
//		System.out.println("Logging after controller method execution....!");
//	}
	
	@Around("execution(* com.satya.controller.*.*(..))")
	public Object logControllerAroundMethod(ProceedingJoinPoint joinPoint)throws Throwable {
		System.out.println("Logging Before Method Execution....!");//gift 
		Object result = joinPoint.proceed();
		System.out.println("Logging After Method Execution....!");//point  
		return result;
	}
	
//	@AfterReturning(pointcut = "execution(* com.satya.controller.*.*(..))",returning = "result")
//	public void logControllerAfterThrowingAdviceMethod(Object result)throws Throwable {
//		System.out.println("Logging After Method Execution...., return : "+result);
//		
//	}
	
	@AfterThrowing(pointcut = "execution(* com.satya.controller.*.*(..))",throwing =  "ex")
	public void logControllerAfterThrowingAdviceMethod(Exception ex)throws Throwable {
		System.out.println("Exception Occured "+ex.getMessage());
		
	}


}
