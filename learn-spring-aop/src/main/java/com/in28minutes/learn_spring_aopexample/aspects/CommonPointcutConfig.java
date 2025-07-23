package com.in28minutes.learn_spring_aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
	
	@Pointcut("* com.in28minutes.learn_spring_aopexample.aopexample.*.*.*(..)")
	public void bussinessPackageConfig() {
		
	}

}
