package com.che.demo.thinkingInOO;

public class Car extends Vehicle {
	
	private String type;
	
	public Car(String type){
		this.type = type;
	}

	@Override
	void go(String addressName) {
		System.out.println("开着" + type + "轰隆隆地 go to " + addressName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
