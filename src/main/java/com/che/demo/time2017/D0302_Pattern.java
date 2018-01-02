package com.che.demo.time2017;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class D0302_Pattern {
	private static String[] mathers = { "2014/12/3", "2013/10/3"};
	private static String[] mathers2 = { "1914", "2013", "1899"};
	private static String[] mathers3 = { "1-31", "5-8", "10-11"};
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("\\d{4}[/](([1|3|5|7|8|10|12][/](([1-9])|([1|2]\\d)|([3][0|1])))|([2|4|6|9|11][/](([1-9])|([1|2]\\d)|([3][0]))))");
//		Pattern p = Pattern.compile("^\\d{4}[/](([1|3|5|7|8|10|12][/](([1-9])|([1|2]\\d)|([3][0|1])))|([2|4|6|9|11][/](([1-9])|([1|2]\\d)|([3][0]))))$");
		Pattern p = Pattern.compile("^\\d{4}[/](([0]?[1-9])|([1][0-2]))[/]([0-3]?[0-9])$");
	    for (String str : mathers) {
	        Matcher m = p.matcher(str);
//	        System.out.println(m.matches());
	    }
	    
		Pattern p3 = Pattern.compile("^\\d{4}[/]((([1|3|5|7|8]|10|12)[/]([1-9])))$");
//	    for (String str : mathers3) {
//	        Matcher m = p2.matcher(str);
//	        System.out.println(m.matches());
//	    }
		for (String str : mathers) {
	        Matcher m = p3.matcher(str);
//	        System.out.println(m.matches());
	    }
		
	}

}
