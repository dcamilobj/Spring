package com.udemy.springdemo;

import java.util.Random;

public class RandomFortuneService  implements FortuneService{

	private String[] fortuneList = {
			"This is your lucky week",
			"This is your lucky month",
			"This is your lucky year"
	};
		
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int randomNumber = random.nextInt(fortuneList.length);
		return fortuneList[randomNumber];
	}

	
}
