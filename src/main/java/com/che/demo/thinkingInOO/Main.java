package com.che.demo.thinkingInOO;

public class Main {
	
	public static void main(String[] args) {
		Driver driver = new Driver("老王");
		Car car = new Car("宝马");
		Plane plane = new Plane("特牛战机");
		
		driver.drive(car, new Address("东北"));
		driver.drive(plane, new Address("东北"));
	}

}
