package com.in28minutes.learn_spring_framework.examples.h1;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * When @Configuration and configurationApplicationContext didn't exist, you would use a xml file in order to configure your beans
 * 
 * 
 */


public class XmlConfigurationContextLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new ClassPathXmlApplicationContext("contextConfiguration.xml") ) {
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
			
		}
		
	}

}
