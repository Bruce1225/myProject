package com.che.demo.time2017;

import java.util.Random;

public class D0401_UsedChineseString {

	public static void main(String[] args) {
		String base = "\u7684\u4e00\u4e86\u662f\u6211\u4e0d\u5728\u4eba\u4eec\u6709\u6765\u4ed6\u8fd9\u4e0a";
		String ch = base.charAt(new Random().nextInt(base.length())) + ";" + base.length();
		System.out.println(ch);
	}
}
