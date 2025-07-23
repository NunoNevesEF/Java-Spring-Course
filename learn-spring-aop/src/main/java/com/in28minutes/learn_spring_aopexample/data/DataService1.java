package com.in28minutes.learn_spring_aopexample.data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
	
	public void dataService1() {
		
	}
	
	public int[] retreiveData() {
		return new int[] {11,22,33,44,55};
	}
	
	
}
