package com.nauka.spring5.postContstructPreDestroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdnotacjaApp {

	public static void main(String[] args) {
		//zaladowanie konfiguracji Spring
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-postContstructPreDestroy.xml");
		
		//zaladowanie Bean'a z kontenera
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		//wywolanie metod na Bean'ie
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
				
		//zamkniecie kontekstu
		context.close();
	}
}