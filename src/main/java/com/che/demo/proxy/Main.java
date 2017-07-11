package com.che.demo.proxy;

public class Main {

	public static void main(String[] args) {
		Moveable moveable = new Tank(007);
		Moveable tlp = new TankLongProxy(moveable);
		Moveable ttp = new TankTimeProxy(tlp);
		ttp.move();
		

//		Moveable ttp = new TankTimeProxy(moveable);
//		Moveable tlp = new TankLongProxy(ttp);
//		tlp.move();
	}
}
