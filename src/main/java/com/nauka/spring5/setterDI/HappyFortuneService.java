package com.nauka.spring5.setterDI;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Dobra wr�ba";
	}
}