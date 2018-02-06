package com.che.demo.time2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D0601_hashCode {

	public static void main(String[] args) {
		String s1 = "中华人民共和国";
		System.out.println(' ' + 0);
		System.out.println(' ' + 0);
		System.out.println(s1.toCharArray());
		
		List<String> l = new ArrayList<String>();
		Collections.emptyList();
		
		int h = 0;
		Object c = null;
		char[] value = s1.toCharArray();
		System.out.println(value.length);
		if (h == 0 && value.length > 0) {
            char val[] = value;

            for (int i = 0; i < value.length; i++) {

//            	System.out.print( val[i] + ":");
//            	System.out.println(0 + val[i]);
                h = 31 * h + val[i];
            }
        }
	}
	
}
