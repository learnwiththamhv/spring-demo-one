package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private ArrayList<String> fortunes = new ArrayList<String>();

	public RandomFortuneService() {
		fortunes.add("Random Fortune 0");
		fortunes.add("Random Fortune 1");
		fortunes.add("Random Fortune 2");
	}

	@Override
	public String getFortune() {
		Random rand = new Random();
		return fortunes.get(rand.nextInt(3));
	}

}
