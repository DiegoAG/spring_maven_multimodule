package com.altia.formacion.spring.servicios;

//@Named
public class MessagePrinter {

    final private MessageService service;

    //@Inject
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}