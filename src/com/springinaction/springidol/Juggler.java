/**
 * 
 */
package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HR
 *
 */
public class Juggler implements Performer {
	
	private int beanBags = 3;
	
	public Juggler() {
		
	}
	
	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}
	
	

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Performer#perform()
	 */
	@Override
	public void perform() throws PerformanceException {

		System.out.println("JUGGLING " + beanBags + " BEANBAGS");

	}
	


}
