package com.in28minutes.springboot.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration configuration;

	
	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retreiveAllCourses() {
		return configuration;
		
	}
}

