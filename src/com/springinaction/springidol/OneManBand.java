/**
 * 
 */
package com.springinaction.springidol;

import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/**
 * @author HR
 *
 */
public class OneManBand implements Performer {
	
	public OneManBand() {
		
	}

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 */
	@Override
	public void perform() throws PerformanceException {
		//通过list或者set装配
//		for(Instrument instrument:instruments) {
//			instrument.play();
//		}
		
		//通过map装配
//		for(String key:instruments.keySet()) {
//			System.out.print(key + " : ");
//			Instrument instrument = instruments.get(key);
//			instrument.play();
//		}
		
		//通过properties装配
		for(Object key:instruments.keySet()) {
			System.out.println(key + " : " + instruments.getProperty((String) key));
		}

	}
	
	/**通过list或者set装配
	private Collection<Instrument> instruments;

	//注入instruments集合
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	*/
	
	/**通过map装配
	 * 
	private Map<String,Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
	
	*/
	
	private Properties instruments;

	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
	

}
