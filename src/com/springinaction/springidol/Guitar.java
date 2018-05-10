package com.springinaction.springidol;

import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;

@StringedInstrument
@Component	//Bean的ID默认为无限定类名，此处为guitar
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Guitar Guitar Guitar");

	}

}
