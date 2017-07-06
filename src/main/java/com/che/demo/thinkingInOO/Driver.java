package com.che.demo.thinkingInOO;

public class Driver {
	
	private String name;
	
	public Driver(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void drive(Vehicle vehicle, Address address){
		System.out.print(name);
		vehicle.go(address.getName());
	}
}
