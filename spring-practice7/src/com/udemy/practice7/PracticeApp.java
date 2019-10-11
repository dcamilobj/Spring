package com.udemy.practice7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp {

	public static void main(String[] args) {
		// Load the spring config java class 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigPractice.class);
		
		// Retrieve bean from spring container
		Coach theCoach = context.getBean("soccerCoach", Coach.class);
		
		// Call some methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// Close context
		context.close();

	}

}
