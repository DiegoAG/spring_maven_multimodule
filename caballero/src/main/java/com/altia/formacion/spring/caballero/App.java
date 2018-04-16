package com.altia.formacion.spring.caballero;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.altia.formacion.spring.caballero.config.KnightConfig;

public class App 
{
    public static void main( String[] args )
    {
    	Knight k = new DamselRescuingKnight();
    	k.embarkOnQuest();
    	
    	ClassPathXmlApplicationContext context = 
    		new ClassPathXmlApplicationContext("META-INF/beans.xml");
    	
    	Knight bk = (Knight) context.getBean("knight");
    	bk.embarkOnQuest();
    	
    	AnnotationConfigApplicationContext contextAnn =
    			new AnnotationConfigApplicationContext(KnightConfig.class);
    	
    	Knight bkAnn = (Knight) contextAnn.getBean("knight");
    	bkAnn.embarkOnQuest();
    }
}
