package com.altia.formacion.spring.caballero;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest {

	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream stream) {
		this.stream = stream;
	}
	
	public void embark() {
		stream.println("Vamos a matar al dragon");		
	}

}
