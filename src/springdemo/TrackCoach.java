package springdemo;

public class TrackCoach implements Coach {

	private FortuneService theFortuneService;

	public TrackCoach(FortuneService myFortuneService) {
		theFortuneService = myFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K meters";
	}

	@Override
	public String getFortune() {
		return "Just do it, "+theFortuneService.getFortune();
	}
}
