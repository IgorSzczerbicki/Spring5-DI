package com.nauka.spring5.component;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Trening dla tenisa";
	}
}