package com.in28minutes.learn_spring_aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Around("* com.in28minutes.learn_spring_aopexample.aopexample.*.*.*(..)")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		// Start a timer
		long startTime = System.currentTimeMillis();
		
		// Execute Method
		Object returnValue = proceedingJoinPoint.proceed();
		
		// Stop the timer
		long stopTime = System.currentTimeMillis();
		long duration = stopTime - startTime;

		logger.info("@Around Aspect - {} Method executed in {}",proceedingJoinPoint,duration);
		
		return returnValue;
	}
	
}
