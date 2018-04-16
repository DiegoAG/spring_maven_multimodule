package com.altia.formacion.spring.sistemasonido;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.altia.formacion.spring.sistemasonido.config.CDPlayerConfig;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CDPlayerConfig.class);

		MediaPlayer mp = context.getBean(CDPlayer.class);
		mp.play();

		CompactDisc cd = (CompactDisc)context.getBean("lonelyHeartsClub");
		cd.play();
		
		ClassPathXmlApplicationContext contextXml = 
				new ClassPathXmlApplicationContext("META-INF/beans.xml");

		CompactDisc cd2 = contextXml.getBean(SgtPeppers.class);
		cd2.play();
	}
}
