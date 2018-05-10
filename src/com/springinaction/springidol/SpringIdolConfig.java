package com.springinaction.springidol;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ����JAVA��������������ע�����ò���ͨ��
 * �����ڱ������ͨ��ע��������bean�������ﲢ����ֱ��ʹ��
 * @author HR
 *
 */
@Configuration	//��֪Spring������ཫ����һ������bean�Ķ���
public class SpringIdolConfig {

	@Bean	//����������Ϊ��bean��ID
	public Performer duke() {
		return new Juggler(15);
	}

	@Bean
	public Poem sonnet29() {
		return new Sonnet29();
	}
	
	@Bean
	public Performer poeticDuck() {
		//����sonnet29ʱ��Spring�����ظ÷����ĵ���
		return new PoeticJuggler(sonnet29());
	}
}
