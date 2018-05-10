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
	@StringedInstrument //ʹ���Զ����ע�⣬ֻ�����������ϣ��������ڷ�����
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
	//@Qualifier("guitar")	//�޶��Զ�װ���bean����Ϊguitar
	//@Qualifier("stringed")//�޶��Զ�װ���bean��qualifier����Ϊstringed
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public String selectSong(String s) {
		return null;
		
	}

}
