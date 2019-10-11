package com.udemy.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] fortuneList = {"This month is your lucky month",
			"This week is your lucky week",
			"This year is your lucky year"};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int randomNumber = random.nextInt(fortuneList.length);
		return fortuneList[randomNumber];
	}

}
