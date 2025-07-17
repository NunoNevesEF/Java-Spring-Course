package com.in28minutes.learn_spring_framework.examples.e1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
 * Beans are singleton by default, meaning if you want to get a bean from a class, it will be the same instance
 * If you want to have multiple instances of the same bean you need to use the @Scope (value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
 * making this a Prototype instead of a singleton
 * 
 * Scopes are only for web-aware Spring applicationContext
 * 
 * Spring Singleton -> one object instance per IOC container
 * Java Singleton -> one object instance per JVM
 * 
 * Spring singleton = Java singleton only when you have 1 IOC container inside the JVM
 * 
 */

@Component
class NormalClass {
	
}

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {
	
}


@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
	
	public static void main(String[] args) {
		
		try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
				
				System.out.println(context.getBean(NormalClass.class));
				System.out.println(context.getBean(NormalClass.class));


				
				System.out.println(context.getBean(PrototypeClass.class));
				System.out.println(context.getBean(PrototypeClass.class));
				System.out.println(context.getBean(PrototypeClass.class));

			
		}
		
	}

}
