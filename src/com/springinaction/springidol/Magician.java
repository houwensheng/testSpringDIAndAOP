package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Magician implements MindReader {
	
	private String thoughts;
	
	//声明参数化的切点
	@Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomeThing(String)) && args(thoughts)")
	public void thinking(String thoughts) {
		
	}
	
	@Override
	@Before("thinking(thoughts)")	//把参数传递给通知
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts : " + thoughts);
		this.thoughts = thoughts;

	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
