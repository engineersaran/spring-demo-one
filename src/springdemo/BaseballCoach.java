package springdemo;

public class BaseballCoach implements Coach {

	private FortuneService theFortuneService;
	
	public BaseballCoach(FortuneService myFortuneService) {
		theFortuneService = myFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practices";
	}
	
	@Override
	public String getFortune() {
		return theFortuneService.getFortune();
	}
}
