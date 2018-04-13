package com.altia.formacion.spring.caballero;

import org.springframework.context.support.ClassPathXmlApplicationContext;

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
    }
}
