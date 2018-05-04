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
		
		//zamkniecie kontekstu
		context.close();
	}
}