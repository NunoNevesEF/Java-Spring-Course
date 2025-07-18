package com.in28minutes.springboot.learn_jpa_and_hibernate.courseJdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbc;
	
	private static String INSERT_QUERY = """
			insert into Course(id,name,author) values (?,?,?);
			""";
	
	private static String DELETE_QUERY = """
			delete from Course where id = ?
			""";
	
	private static String SELECT_QUERY = """
			select from Course where id = ?
			""";
	
	
	public void insert(Course course) {
		springJdbc.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbc.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		return springJdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class) ,id);		
	}
	
}
