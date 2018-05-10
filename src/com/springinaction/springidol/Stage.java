/**
 * 
 */
package com.springinaction.springidol;

/**
 * @author HR
 * 只有一个舞台，整成单例
 */
public class Stage {
	//没有公开的构造方法
	private Stage() {
		
	}
	
	//延迟加载实例
	private static class StageSingletonHolder{
		static Stage instance = new Stage();
	}
	
	public static Stage getInstance() {
		return StageSingletonHolder.instance;
	}

}
