package com.nauka.spring5.qualifier;

import org.springframework.stereotype.Component;
import com.nauka.spring5.constructorDI.FortuneService;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Losowa wró¿ba";
	}

}
