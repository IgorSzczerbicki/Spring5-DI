package com.nauka.spring5.fieldDI;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	@Override
	public String getFortune() {
		return "Dobra wr�ba";
	}
}