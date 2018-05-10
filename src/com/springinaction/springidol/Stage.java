/**
 * 
 */
package com.springinaction.springidol;

/**
 * @author HR
 * ֻ��һ����̨�����ɵ���
 */
public class Stage {
	//û�й����Ĺ��췽��
	private Stage() {
		
	}
	
	//�ӳټ���ʵ��
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}

}
