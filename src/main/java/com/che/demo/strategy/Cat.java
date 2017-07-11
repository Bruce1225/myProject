package com.che.demo.strategy;

public class Cat implements CompareTo{
	
	private int height;
	private int weight;
	
	public Cat(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public int compareTo(Object o){
		Cat cat = (Cat) o;
		if(height - cat.getHeight() > 0) return 1;
		if(height - cat.getHeight() < 0) return -1;
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
		return "cat:" + height + "|" + weight;
	}

}
