package com.che.demo.thinkingInOO;

public abstract class Vehicle {
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void go(String addressName);

}
