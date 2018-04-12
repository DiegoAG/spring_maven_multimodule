package com.altia.formacion.spring.caballero;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class AppTest 
{
	@Test
	public void knightShouldEmbarkOnQuest() {
		Quest mockQuest = mock(Quest.class);
		Knight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();
		verify(mockQuest, times(1)).embark();
	}
}
