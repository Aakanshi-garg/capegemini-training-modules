package com.spring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student std1 () {
		
		Student std = new Student();
		std.setName("aakanshi");
		std.setRoll(1);
		std.setEmail("aakanshigarg62@gmail.com");
		return std;
		
	}

}



