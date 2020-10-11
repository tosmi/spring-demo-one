package at.stderr.springdemo;

public class TennisCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do a 100 topspin services";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("TennisCoach: inside init-method");
	}
	
	public void destroyMethod() {
		System.out.println("TennisCoach: inside destroy-method");
	}
}
