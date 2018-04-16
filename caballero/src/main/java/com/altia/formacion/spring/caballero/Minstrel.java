package com.altia.formacion.spring.caballero;

import java.io.PrintStream;

public class Minstrel {
	private PrintStream stream;
	
	public Minstrel(PrintStream stream) {
		this.stream = stream;
	}
	
	public void singBeforeQuest() {
		stream.println("El caballero se dispone a ir a la batalla lalaraa");
	}
	
	public void singAfterQuest() {
		stream.println("El caballero ha ganado la batalla fa lalalalala");
	}
}
