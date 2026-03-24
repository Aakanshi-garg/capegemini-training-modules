package com.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.beans.Address;
import com.spring.beans.Student;
import com.spring.beans.Subjects;

@Configuration
public class SpringConfigFile {
	
	@Bean(name = "add1")
	public Address createAddress() {
		Address add = new Address(111, "delhi ", 201310);
		return add ; 
	}
	
	@Bean(name = "add2")
	public Address createAddress2() {
		Address add = new Address(112, "chandigarh", 256789);
		return add ; 
	}
	
	@Bean
	public Subjects createSubjects() {
		Subjects subj = new Subjects() ; 
		List<String> subj_list = new ArrayList<String>();
		subj_list.add(" java ");
		subj_list.add(" python ");
		subj_list.add(" C ");
		subj.setSubjects(subj_list);
		return subj ;
		
	}
	
	@Bean(name = "student")
	public Student createStudent() {
		Student std = new Student("aakanshi", 1 );
		return std ; 
	}

}
