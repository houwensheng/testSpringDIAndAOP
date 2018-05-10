/**
 * 
 */
package com.springinaction.springidol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.springinaction.springidol.qualifiers.StringedInstrument;

/**
 * @author HR
 *
 */
public class Instrumentalist implements Performer {

	public Instrumentalist() {
		
	}
	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 */
	@Override
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();

	}
	
	private String song;
	@StringedInstrument //使用自定义的注解，只能用在属性上，不能用在方法上
	private Instrument instrument;
	
	public String getSong() {
		return song;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
//	public Instrument getInstrument() {
//		return instrument;
//	}
	
	//@Autowired
	//@Qualifier("guitar")	//限定自动装配的bean名称为guitar
	//@Qualifier("stringed")//限定自动装配的bean的qualifier属性为stringed
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public String selectSong(String s) {
		return null;
		
	}

}
