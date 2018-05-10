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
		//ͨ��list����setװ��
//		for(Instrument instrument:instruments) {
//			instrument.play();
//		}
		
		//ͨ��mapװ��
//		for(String key:instruments.keySet()) {
//			System.out.print(key + " : ");
//			Instrument instrument = instruments.get(key);
//			instrument.play();
//		}
		
		//ͨ��propertiesװ��
		for(Object key:instruments.keySet()) {
			System.out.println(key + " : " + instruments.getProperty((String) key));
		}

	}
	
	/**ͨ��list����setװ��
	private Collection<Instrument> instruments;

	//ע��instruments����
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	*/
	
	/**ͨ��mapװ��
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
