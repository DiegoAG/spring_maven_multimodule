package com.altia.formacion.spring.sistemasonido.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.altia.formacion.spring.sistemasonido.CDPlayer;
import com.altia.formacion.spring.sistemasonido.CompactDisc;
import com.altia.formacion.spring.sistemasonido.SgtPeppers;

@Configuration
//@ComponentScan(basePackages = {"com.altia.formacion.spring.sistemasonido"})
public class CDPlayerConfig {
	@Bean(name= {"lonelyHeartsClub"})
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
	
	@Bean
	public CDPlayer cdPlayer() {
		CDPlayer cdPlayer = new CDPlayer();
		cdPlayer.insertDisc(sgtPeppers());
		return cdPlayer;
	}
}
