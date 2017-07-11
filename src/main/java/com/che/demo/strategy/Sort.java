package com.che.demo.strategy;

public class Sort {
	
	public static void sort(int[] os){
		int temp = 0;
		for(int i = 0; i < os.length; i ++){
			for(int j = i + 1; j < os.length; j ++){
				if(os[i] > os[j]){
					temp = os[j];
					os[j] = os[i];
					os[i] = temp;
				}
			}
		}
	}
	
	public static void sort(CompareTo[] animals){
		CompareTo temp = null;
		for(int i = 0; i < animals.length; i ++){
			for(int j = i + 1; j < animals.length; j ++){
				if(animals[i].compareTo(animals[j]) > 0){
					temp = animals[j];
					animals[j] = animals[i];
					animals[i] = temp;
				}
			}
		}
	}

}
