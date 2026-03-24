package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.spring.beans.Student;
import com.spring.resources.SpringConfigFile;


public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
         Student std = (Student) context.getBean( "student" );
         std.display();
    }
}
