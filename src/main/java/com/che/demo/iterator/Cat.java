package com.che.demo.iterator;

public class Cat {
	
	private int id;
	
	public Cat(int id){
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString(){
		return "Cat:" + id;
	}
}
