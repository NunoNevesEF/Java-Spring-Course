package com.in28minutes.learn_spring_aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	// execution(* Package.*.*(..))
	// execution(* com.in28minutes.learn_spring_aopexample.aopexample.business.*.*(..))
	@Before("com.in28minutes.learn_spring_aopexample.aspects.CommonPointcutConfig.bussinessPackageConfig()")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
		logger.info("Before Aspect - {}", joinPoint, joinPoint.getArgs());
	}

	
	@After("* com.in28minutes.learn_spring_aopexample.aopexample.*.*.*(..)")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		logger.info("After Aspect - {}", joinPoint, joinPoint.getArgs());
	}
	
	@AfterThrowing(pointcut="* com.in28minutes.learn_spring_aopexample.aopexample.*.*.*(..)", throwing="exception")
	public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
		logger.info("AfterThrowing Aspect - {}", joinPoint, joinPoint.getArgs());
	}
	
	@AfterReturning(pointcut="* com.in28minutes.learn_spring_aopexample.aopexample.*.*.*(..)", returning="resultValue")
	public void logMethodCallAfterReturningSucessfully(JoinPoint joinPoint, Object resultValue) {
		logger.info("AfterReturning Aspect - {}", joinPoint, joinPoint.getArgs());
	}
}
