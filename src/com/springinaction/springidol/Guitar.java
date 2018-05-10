package com.springinaction.springidol;

import org.springframework.stereotype.Component;

import com.springinaction.springidol.qualifiers.StringedInstrument;

@StringedInstrument
@Component	//Bean��IDĬ��Ϊ���޶��������˴�Ϊguitar
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("Guitar Guitar Guitar");

	}

}
