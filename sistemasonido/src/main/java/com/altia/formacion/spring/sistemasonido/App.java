package com.altia.formacion.spring.sistemasonido;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
        	new AnnotationConfigApplicationContext(CDPlayerConfig.class);
    	
    	CompactDisc cd = context.getBean(SgtPeppers.class);
    	cd.play();
    }
}
