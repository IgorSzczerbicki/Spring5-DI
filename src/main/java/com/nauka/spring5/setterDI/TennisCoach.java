package com.nauka.spring5.setterDI;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

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