package com.in28minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @PostConstruct is used to run code after dependency Injection but still not beans created
 * 
 * @PreDestroy is used to run code when bean is going to be removed from the Spring Context 
 * 
 */

@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("buh");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
		
	}	
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("Clean");
		
	}	
}

@Component
class SomeDependency {
	public void getReady() {
		System.out.println("Some logic");
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)) {
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
			
		}
		
	}

}
