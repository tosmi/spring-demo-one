package at.stderr.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String[] fortuneList = {
			"This is your lucky day",
			"Best day ever",
			"Can't get any better",
	};
	
	private Random rnd = new Random();
	
	@Override
	public String getFortune() {
		int index = rnd.nextInt(fortuneList.length);
		return fortuneList[index];
	}

}
