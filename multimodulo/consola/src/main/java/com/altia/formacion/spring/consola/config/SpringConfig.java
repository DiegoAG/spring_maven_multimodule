package com.altia.formacion.spring.consola.config;

import org.springframework.context.annotation.Bean;

import com.altia.formacion.spring.servicios.MessagePrinter;
import com.altia.formacion.spring.servicios.MessageService;
import com.altia.formacion.spring.servicios.MessageServiceImpl;

public class SpringConfig {
	@Bean
	MessageService getMessageService() {
		return new MessageServiceImpl();
	}
	
	@Bean
	MessagePrinter getMessagePrinter() {
		return new MessagePrinter(getMessageService());
	}
//	MessageService mockMessageService() {
//		return new MessageService() {
//			public String getMessage() {
//				return "Hello World!";
//			}
//		};
//	}
}
