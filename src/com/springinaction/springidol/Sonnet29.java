/**
 * 
 */
package com.springinaction.springidol;

import org.springframework.stereotype.Component;

/**
 * @author HR
 *
 */
public class Sonnet29 implements Poem {
	
	private static String[] LINES = {
			"The time that my journey takes is long and the way of it long.",
			"I came out on the chariot of the first gleam of light, ",
			"and pursued my voyage through the wildernesses of worlds ",
			"leaving my track on many a star and planet."
	};
	
	public Sonnet29() {
		
	}
	

	/* (non-Javadoc)
	 * @see com.springinaction.springidol.Poem#recite()
	 */
	@Override
	public void recite() {
		for(String s:LINES) {
			System.out.println(s);
		}

	}

}
