package com.che.demo.strategy;

public class Dog implements CompareTo{
	
	private int height;
	private int weight;
	
	public Dog(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	
	public int compareTo(Object o){
		Dog dog = (Dog) o;
		if(height - dog.getHeight() > 0) return 1;
		if(height - dog.getHeight() < 0) return -1;
		return 0;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		return "dog:" + height + "|" + weight;
	}

}
