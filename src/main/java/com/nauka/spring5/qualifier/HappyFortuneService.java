package com.nauka.spring5.qualifier;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Dobra wró¿ba";
	}
}