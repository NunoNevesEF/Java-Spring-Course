package com.in28minutes.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


/**
 * Simple example to present the CDI specification (interface)
 * Spring framework implements CDI 
 * 
 */


//@Component
@Named
class BusinessService {
	
	private DataService service;

	public DataService getService() {
		return service;
	}

	//@Autowired
	@Inject
	public void setService(DataService service) {
		System.out.println("Buh");
		this.service = service;
	}
}


//@Component
@Named
class DataService {
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
				
				System.out.println(context.getBean(BusinessService.class).getService( ));
			
		}
		
	}

}
