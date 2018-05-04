package com.nauka.spring5.component;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdnotacjaApp {

	public static void main(String[] args) {
		//zaladowanie konfiguracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-component.xml");
		
		//zaladowanie Bean'a z kontenera
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//wywolanie metod na Bean'ie
		System.out.println(theCoach.getDailyWorkout());
		
		//zaladowanie Bean'a z kontenera z domyœlnym ID
		Coach theCoach2 = context.getBean("swimmingCoach", Coach.class);
		
		//wywolanie metod na Bean'ie z domyslnym ID
		System.out.println(theCoach2.getDailyWorkout());
		
		//zamkniecie kontekstu
		context.close();
	}
}