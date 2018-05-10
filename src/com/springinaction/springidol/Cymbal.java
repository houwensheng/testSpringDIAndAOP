package com.springinaction.springidol;

import org.springframework.stereotype.Component;

//@Component
public class Cymbal implements Instrument {

	@Override
	public void play() {
		System.out.println("Cymbal Cymbal Cymbal");

	}

}
