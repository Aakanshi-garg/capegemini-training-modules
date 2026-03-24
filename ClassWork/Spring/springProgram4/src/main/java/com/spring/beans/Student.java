package com.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value( "1")
	private int roll ;
	@Value("aakanshi")
	private String name ;
	@Value("aakanshigarg62@gmail.com")
	private String email ;
	
	public int getRoll() {
		return roll ;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void display ( ) {
		System.out.println( "name " +  name);
		System.out.println( "Email " + email);
		System.out.println( "Roll_no " + roll);
	}
	
	

}
