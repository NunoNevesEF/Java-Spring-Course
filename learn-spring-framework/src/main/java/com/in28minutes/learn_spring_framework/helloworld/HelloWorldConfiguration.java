package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;



// Released in JDK16, similar to a class in Kotlin
record Person (String name, int age, Address address) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Buh";
	}
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("buh",17, new Address("city", "buh"));
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address()); // name , age
	}
	
	
	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name,age,address); // name , age
	}
	
	@Bean
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name,age,address); // name , age
	}
	
	@Bean
	public Address address() {
		return new Address("buh","cuh");
	}
	

}
