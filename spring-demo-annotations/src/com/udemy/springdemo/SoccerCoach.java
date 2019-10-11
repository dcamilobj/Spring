package com.udemy.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String  team;

	@Override
	public String getDailyWorkout() {
		return "Practice your soccer for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
