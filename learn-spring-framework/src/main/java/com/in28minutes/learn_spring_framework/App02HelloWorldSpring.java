package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Launch a Spring context / application
		// Configure the things we want Spring to manage - @Configuration
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		System.out.println(context.getBean("name"));
		
	}

}
