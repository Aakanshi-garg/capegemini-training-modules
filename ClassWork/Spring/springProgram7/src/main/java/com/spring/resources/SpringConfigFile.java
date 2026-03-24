package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Address;
import com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddress() {
		Address add = new Address(111, "delhi ", 201310);
		return add ; 
	}
	
	@Bean
	public Student createStudent() {
		Student std = new Student("aakanshi", 1, createAddress());
		return std ; 
	}

}
