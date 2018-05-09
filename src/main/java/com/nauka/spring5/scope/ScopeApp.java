package com.nauka.spring5.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeApp {

	public static void main(String[] args) {
		//zaladowanie pliku konfiguracji
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-scope.xml");
		
		//zaladowanie Bean'ów typu Singleton z kontenera
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);
		
		//zaladowanie Bean'ów typu Prototype z kontenera
		Coach theFootballCoach = context.getBean("footballCoach", Coach.class);
		Coach theFootballCoach2 = context.getBean("footballCoach", Coach.class);
		
		//sprawdzenie, czy te same
		System.out.println("Signleton, te same obiekty? " + (theCoach == theCoach2));
		
		System.out.println("Prototype, te same obiekty? " + (theFootballCoach == theFootballCoach2));
		
		//zamkniecie kotekstu
		context.close();
	}
}