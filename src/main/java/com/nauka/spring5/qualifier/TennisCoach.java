package com.nauka.spring5.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	public TennisCoach() {}
	
	@Override
	public String getDailyWorkout() {
		return "Trening dla tenisa";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
}