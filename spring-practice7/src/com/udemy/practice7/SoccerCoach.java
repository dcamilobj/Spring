package com.udemy.practice7;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Soccer during your whole life";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
