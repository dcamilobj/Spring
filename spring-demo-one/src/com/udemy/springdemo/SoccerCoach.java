package com.udemy.springdemo;

public class SoccerCoach implements Coach {

	private FortuneService fortuneService;
	
	public SoccerCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice soccer during 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return "Soccer: " + fortuneService.getFortune();
	}

}
