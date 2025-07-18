package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataRepository repository;

	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"LearnAws","Buh"));
		repository.save(new Course(2,"buh","cuh"));
		
		repository.deleteById(1l);
				
		System.out.println(repository.findById(2l));
		
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("cuh"));

	}
}
