package com.che.demo.time2017;

public class D0301_DoubleToInt {

	public static void main(String[] args) {
        double d1  = 5.9;  
        int i1 = (int)d1;  
        System.out.println(i1);  

        Double d3  = 5.9;  
        int i3 =  d3.intValue();  
        System.out.println(i3); 
        
        String d5 = "5";
        System.out.println(Double.valueOf(d5).intValue());
        
/*      报错：NumberFormatException: For input string: "5.9"
		Double d2  = 5.9;  
        int i2 =  Integer.valueOf(d2.toString());  
        System.out.println(i2); 
*/
        
        double d4 = 101.00000;
        System.out.println(100*(int)d4 + "---" + (100*(int)d4 - 100*d4==0?true:false));
        System.out.println(0.000==0.0?true:false);
        
	}
}
