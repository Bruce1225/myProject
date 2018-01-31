package com.che.demo.time2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D0501_java8 {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("a111");
		l.add("b222");
		l.forEach(e -> System.out.println( e ));
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		int a1[] = {1};
		String a2[] = {"",""};
		String a3[] = new String[3];
		int[][] a4 = new int[3][3];
	}

}
