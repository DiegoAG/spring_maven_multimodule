package com.altia.formacion.spring.consola;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.altia.formacion.spring.consola.config.SpringConfig;
import com.altia.formacion.spring.servicios.MessagePrinter;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						SpringConfig.class);
		
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		
		System.out.println("Multimódulo");
		printer.printMessage();
	}
}
