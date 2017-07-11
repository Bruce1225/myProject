package com.che.demo.proxy;

public class TankTimeProxy implements Moveable {
	
	private Moveable moveable;
	
	public TankTimeProxy(Moveable moveable){
		this.moveable = moveable;
	}

	@Override
	public void move() {

		System.out.println("时间记录开始。。。");
		Long start = System.currentTimeMillis();
		moveable.move();
		Long end = System.currentTimeMillis();
		System.out.println("时间记录完成。。。");
		System.out.println("所用时间为:" + (end - start)/1000);

	}

}
