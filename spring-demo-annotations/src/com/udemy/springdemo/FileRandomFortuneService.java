package com.udemy.springdemo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService {

	private String filePath = "c://fortunes.txt";
	private String[] fortuneArray;
	private Random random = new Random();

	public FileRandomFortuneService() {

	}
	
	@PostConstruct
	public void readFile() {
		System.out.println(">> Inside readFile that is a postContructMethod");
		try (Stream<String> fortunes = Files.lines(Paths.get(filePath))) {
			fortuneArray = fortunes.toArray(String[]::new);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}

	@Override
	public String getFortune() {
		int randomNumber = random.nextInt(fortuneArray.length);
		return fortuneArray[randomNumber];
	}

}
