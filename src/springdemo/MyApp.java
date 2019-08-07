package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theTrackCoach = applicationContext.getBean("myTrackCoach", Coach.class);
		Coach theBaseballCoach = applicationContext.getBean("myBaseballCoach", Coach.class);
		CricketCoach thecricketCoach = applicationContext.getBean("mycricketCoach", CricketCoach.class);
		System.out.println("Daily workout from TrackCoach: "+theTrackCoach.getDailyWorkout());
		System.out.println("Daily fortune from TrackCoach: "+theTrackCoach.getFortune());
		System.out.println("Daily workout from BaseballCoach: "+theBaseballCoach.getDailyWorkout());
		System.out.println("Daily fortune from BaseballCoach: "+theBaseballCoach.getFortune());
		System.out.println("Daily workout from CricketCoach: "+thecricketCoach.getDailyWorkout());
		System.out.println("Daily fortune from CricketCoach: "+thecricketCoach.getFortune());
		System.out.println("CricketCoach email Id: "+thecricketCoach.getEmailAddress());
		System.out.println("CricketCoach team name: "+thecricketCoach.getTeam());
		System.out.println("CricketCoach Name: "+thecricketCoach.getCoachName());
		System.out.println("CricketCoach age: "+thecricketCoach.getAge());
		applicationContext.close();
		
	}
}
