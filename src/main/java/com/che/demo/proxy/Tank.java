package com.che.demo.proxy;

public class Tank implements Moveable {
	
	private int id;
	
	public Tank(int id){
		this.id = id;
	}

	@Override
	public void move() {

		System.out.println("Tank:" + id +" move start...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Tank:" + id +" move end...");

	}

}
