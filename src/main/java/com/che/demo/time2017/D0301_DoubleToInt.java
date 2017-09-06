package com.che.demo.time2017;

public class D0301_DoubleToInt {

	public static void main(String[] args) {
        double d1  = 5.9;  
        int i1 = (int)d1;  
        System.out.println(i1);  

        Double d3  = 5.9;  
        int i3 =  d3.intValue();  
        System.out.println(i3); 
        
/*      报错：NumberFormatException: For input string: "5.9"
		Double d2  = 5.9;  
        int i2 =  Integer.valueOf(d2.toString());  
        System.out.println(i2); 
*/
        
	}
}
