package com.nauka.spring5.postContstructPreDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;
	
	//metoda init
	@PostConstruct
	public void init() {
		System.out.println("metoda init");
	}
	
	//metoda destroy
	@PreDestroy
	public void destroy() {
		System.out.println("metoda destroy");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Trening dla tenisa";
	}

	@Override
	public String getFortune() {
		return this.fortuneService.getFortune();
	}
}