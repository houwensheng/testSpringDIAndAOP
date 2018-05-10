package com.springinaction.springidol;

import org.springframework.stereotype.Component;

@Component
public class Volunteer implements Thinker {

	private String thoughts;
	public void setThoughts(String thoughts) {
		this.thoughts = thoughts;
	}

	@Override
	public void thinkOfSomeThing(String thoughts) {
		this.thoughts = thoughts;
	}

	public String getThoughts() {
		return thoughts;
	}
	
	
}
