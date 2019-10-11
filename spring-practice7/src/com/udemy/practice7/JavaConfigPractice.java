package com.udemy.practice7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigPractice {
	
	@Bean
	public FortuneService practiceFortuneService() {
		return new PracticeFortuneService();
	}
	
	@Bean
	public Coach soccerCoach() {
		return new SoccerCoach(practiceFortuneService());
	}

}
