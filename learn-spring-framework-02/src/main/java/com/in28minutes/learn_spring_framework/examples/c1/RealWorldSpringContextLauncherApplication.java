package com.in28minutes.learn_spring_framework.examples.c1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Component has more precise annotations in order to present your class
 * @Repository for access data base classes
 * @Service for business logic classes
 * @Controler for example for web handlers
 * 
 */

@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
			
				
				System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}

}
