package com.springinaction.springidol;
import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;//JAVA EE�в���������������汾���Լ��¸�jar������ʹ��maven
import javax.inject.Named;
import javax.inject.Provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("kennyI")
public class Instrumentalist2 implements Performer {

	@Inject
	@Named("cymbal")
	public Instrumentalist2(Provider<Instrument> instrumentProvider) {
		instruments = new HashSet<Instrument>();
		for(int i=0;i<5;i++) {
			instruments.add(instrumentProvider.get());
		}
	}
	
	public Instrumentalist2() {
	}

	@Override
	public void perform() throws PerformanceException {
		for(Instrument s:instruments) {
			System.out.print("Playing " + song + " (" + s.hashCode() + ") : ");
			s.play();
		}
	}
	
	@Value("#{systemEnvironment['OS']}")	//ʹ��@Valueʱ������ͨ��SpEL���ʽװ��ֵ
	private String song;
	
	private Set<Instrument> instruments;
	
	public String getSong() {
		return song;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
//
//	public void setInstrument(Instrument instrument) {
//		this.instrument = instrument;
//	}

}
