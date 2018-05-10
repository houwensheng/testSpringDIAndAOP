package com.springinaction.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	@Pointcut("execution(* com.springinaction.springidol.Performer.perform(..))")
	public void performance() {
		
	}

	//表演之前
	@Before("performance()")
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}
	
	//表演之前
	@Before("performance()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones.");
	}
	
	//表演之后
	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("clap clap clap clap");
	}
	
	//表演失败之后
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones.");

			long start = System.currentTimeMillis();
			
			joinpoint.proceed();
			
			long end = System.currentTimeMillis();
			System.out.println("clap clap clap clap");
			System.out.println("The performence took "+(end - start) + " milliseconds.");
		}catch(Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}
}
