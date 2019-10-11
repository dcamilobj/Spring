package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Retrieve bean fron spring container
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		CricketCoach theOtherCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// Verify bean scopes
		boolean result = (theCricketCoach == theOtherCricketCoach);
		
		System.out.println("Both are the same object: " + result);
		System.out.println("\n Memory location theCricketCoach: " + theCricketCoach );
		System.out.println("\n Memory location theOtherCricketCoach: " + theOtherCricketCoach );
		
		// Call methods on the bean 
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getDailyFortune());
		// Call our new method to get inject literal values
		System.out.println(theCricketCoach.getEmailAddress());
		System.out.println(theCricketCoach.getTeam());
		// Close the context
		context.close();
	}

}
