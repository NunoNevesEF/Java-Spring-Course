package com.in28minutes.learn_spring_framework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Notes
 * 
 * ApplicationContext is the most used way in order to manage beans in applications. (Bean factory not used)
 * The IOC container or Spring Container is the context that manages the beans and their lifecycle.
 * POJO -> plain old java object ( All beans and classes created this far are POJO)
 * Java Bean -> Public no argument constructor, needs getters and setters, needs to implement Serializable ( Not used )
 * Spring beans -> @Beans managed by Spring context
 * 
 * In order to solve multiple beans were found you can use @Primary or @Qualifier
 * 
 */

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// Launch a Spring context / application
		// Configure the things we want Spring to manage - @Configuration
		
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean(Person.class));

			
			Arrays.stream(context.getBeanDefinitionNames())
				.forEach(System.out::println); // it -> System.out.println(it)
			
			
		}
		
		
		
	}

}
