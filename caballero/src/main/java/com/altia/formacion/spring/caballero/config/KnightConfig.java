package com.altia.formacion.spring.caballero.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.altia.formacion.spring.caballero.BraveKnight;
import com.altia.formacion.spring.caballero.Knight;
import com.altia.formacion.spring.caballero.Quest;
import com.altia.formacion.spring.caballero.SlayDragonQuest;

@Configuration
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new BraveKnight(quest());
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
