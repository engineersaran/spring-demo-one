package springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	private final String[] fortuneArray = { 
			"Be yourself and try your best", 
			"Be Happy, always be happy", 
			"Love all serve all" 
			};
	
	private final Random randomNumberGenerator = new Random();
	
	@Override
	public String getFortune() {
		return fortuneArray[randomNumberGenerator.nextInt(fortuneArray.length)];
	}

}
