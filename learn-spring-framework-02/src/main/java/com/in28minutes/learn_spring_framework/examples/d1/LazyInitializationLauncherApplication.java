package com.in28minutes.learn_spring_framework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/*
 * Quick example to show how lazy works, its the same as kotlin
 * Bean is by default eager created, you need to use lazy if you don't wan't to create a certain object managed
 * by String to be created when a Spring context is created
 * Lazy -> Only created when someone tries to make use of it
 * Eager -> Created at the start of the creation of a Spring Context
 * 
 * Lazy is mostly used when you have a bean that is rarely used in your application
 * 
 */

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("buh");
		this.classA = classA;
		
	}
	
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {

			context.getBean(ClassB.class);
		}
		
	}

}
