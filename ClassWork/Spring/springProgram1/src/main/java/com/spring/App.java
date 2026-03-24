package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.Student;

public class App {
    public static void main( String[] args ){
    	
       String config_loc = " applicationContext.xml" ;
    	ApplicationContext context = new ClassPathXmlApplicationContext( config_loc ) ; 
    	
    	Student std =  (Student) context.getBean("stdId");
    	std.display();
 }
}
