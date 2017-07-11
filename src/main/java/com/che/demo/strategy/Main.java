package com.che.demo.strategy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
//		int[] i = {9,3,7,1,5};
//		Sort.sort(i);
//		System.out.println(Arrays.toString(i));
		
//		Compareable[] animals = {new Cat(3,3), new Cat(2,4), new Cat(4,2)};
		CompareTo[] animals = {new Dog(3,3), new Dog(2,4), new Dog(4,2)};
		Sort.sort(animals);
		System.out.println(Arrays.toString(animals));
		
	}
}
