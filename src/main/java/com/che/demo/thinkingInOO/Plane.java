package com.che.demo.thinkingInOO;

public class Plane extends Vehicle {

	private String type;
	
	public Plane(String type){
		this.type = type;
	}
	
	@Override
	void go(String addressName) {
		System.out.println("开着" + type + "闪电地go to " + addressName);
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
