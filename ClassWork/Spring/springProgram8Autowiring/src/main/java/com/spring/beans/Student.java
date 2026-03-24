package com.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name ; 
	private int rollNo ;
	
	@Autowired
	@Qualifier("add2")
	private Address address ;
	
	@Autowired
	private Subjects subject ;
	
	public Student(String name, int rollNo  ) {
		
		this.name = name;
		this.rollNo = rollNo;
		
	}
	
	public void display() {
		System.out.println( "Name: " + name);
		System.out.println("roll_No: " + rollNo);
		System.out.println("Address" + address );
		System.out.println("Subjects" + subject );
	}
	
	
	

}
