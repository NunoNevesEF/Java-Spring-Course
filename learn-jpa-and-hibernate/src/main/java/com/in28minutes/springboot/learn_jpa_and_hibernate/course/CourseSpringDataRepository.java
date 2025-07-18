package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataRepository extends JpaRepository<Course,Long>{
	
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);

	
}
