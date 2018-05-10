package com.springinaction.springidol;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Magician implements MindReader {
	
	private String thoughts;
	
	//�������������е�
	@Pointcut("execution(* com.springinaction.springidol.Thinker.thinkOfSomeThing(String)) && args(thoughts)")
	public void thinking(String thoughts) {
		
	}
	
	@Override
	@Before("thinking(thoughts)")	//�Ѳ������ݸ�֪ͨ
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts : " + thoughts);
		this.thoughts = thoughts;

	}

	@Override
	public String getThoughts() {
		return thoughts;
	}

}
