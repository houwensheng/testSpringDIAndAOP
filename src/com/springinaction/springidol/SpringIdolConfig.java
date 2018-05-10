package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于JAVA的配置与别的类中注解配置并不通用
 * 比如在别的类中通过注解声明的bean，在这里并不能直接使用
 * @author HR
 *
 */
@Configuration	//告知Spring，这个类将包含一个或多个bean的定义
public class SpringIdolConfig {

	@Bean	//方法名将作为该bean的ID
	public Performer duke() {
		return new Juggler(15);
	}

	@Bean
	public Poem sonnet29() {
		return new Sonnet29();
	}
	
	@Bean
	public Performer poeticDuck() {
		//引用sonnet29时，Spring会拦截该方法的调用
		return new PoeticJuggler(sonnet29());
	}
}
