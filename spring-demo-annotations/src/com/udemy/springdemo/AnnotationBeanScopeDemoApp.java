package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// Load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		//print the results 
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("Is the same object: " + result);
		
		System.out.println("Memory location for theCoach is: " + theCoach);
		
		System.out.println("Memory location for alphaCoach is: " + alphaCoach);
		
		// close the context 
		context.close();

	}

}
