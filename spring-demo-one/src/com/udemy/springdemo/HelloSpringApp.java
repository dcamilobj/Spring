package com.udemy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
	// Load the spring configuration file
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
	// Retrieve beans from spring container
      Coach theCoach = context.getBean("myCoach",Coach.class);
	// Call methods on the bean
      System.out.println(theCoach.getDailyWorkout());
    // Let's call our new method for fortune
      System.out.println(theCoach.getDailyFortune());
      System.out.println(theCoach);
	// Close the application context
      context.close();
	}

}
