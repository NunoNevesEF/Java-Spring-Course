package com.in28minutes.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Notes 
 * 
 * Field injection -> Use @Autowired inside the class you want to perform the injection (above the dependencies), this uses reflection
 * Constructor injection -> No need to use @Autowired as long your constructor has all the dependencies, Spring will @Autowired it
 * Setter injection -> Same as field Injection but you use @Autowired above the setters of the dependencies
 * 
 * @Component 
 * Used in any place
 * Add the annotation and you don't need to add much more code in order to create the class
 * Injection - field, constructor and setter
 * Spring FrameWork creates the Beans
 * Mostly superior and recommended
 *
 * @Bean
 * Mostly used inside configurationClass
 * You need to create the objects
 * Injection - method call or method parameters
 * You create the Beans
 * Only for custom business logic(verifications before creating a Person example) or 3rd party libraries
 * 
 */

@Component
class YourBusinessClass {
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	//@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}



//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection - SetDependecy 1");
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection - SetDependecy 2");
//		this.dependency2 = dependency2;
//	}
	
	public String toString() {
		return "Using " + dependency1 + " and " + dependency2;
	}
	
}

@Component
class Dependency1 {
	
}

@Component
class Dependency2 {
	
}



@Configuration
@ComponentScan
public class DepInjectionLaunchApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLaunchApplication.class)) {
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
				
				
				System.out.println(context.getBean(YourBusinessClass.class));
			
		}
		
	}

}
