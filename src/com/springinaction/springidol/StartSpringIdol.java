/**
 * 
 */
package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springinaction.springidol.Contestant;
/**
 * @author HR
 *
 */
public class StartSpringIdol {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("autoContext.xml");
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("autoDetectContext4.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aspectjAdvice5.xml");
		
		//Performer performer = (Performer) ctx.getBean("poeticDuke");
		Performer performer = (Performer) ctx.getBean("poeticDuck");
		Thinker thinker = (Thinker) ctx.getBean("volunteer");
		//销毁方法没有执行
		//Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
		try {
			performer.perform();
			((Contestant)performer).receiveAward();
			thinker.thinkOfSomeThing("Oh my god.");
		} catch (PerformanceException e) {
			e.printStackTrace();
		}
		
	}

}
