package com.che.demo.proxy;

public class TankLongProxy implements Moveable {

	private Moveable moveable;
	
	public TankLongProxy(Moveable moveable){
		this.moveable = moveable;
	}
	@Override
	public void move() {
		
		System.out.println("日志记录开始。。。");
		moveable.move();
		System.out.println("日志记录结束。。。");

	}

}
