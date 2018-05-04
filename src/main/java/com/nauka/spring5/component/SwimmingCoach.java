package com.nauka.spring5.component;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Trening p³ywania";
	}
}