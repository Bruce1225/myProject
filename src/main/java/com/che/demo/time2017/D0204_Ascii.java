package com.che.demo.time2017;

import java.util.Arrays;

public class D0204_Ascii {

	public static void main(String[] args) {
		
//		char c = '知';
//		System.out.println((int)c);
		
//		String str = new String("暗示大家".getBytes(),"UTF-8"); 
//		System.out.println(str);
//		//重新用utf-8编码  或者用 
//		System.out.println(URLDecoder.decode(str, "UTF-8"));
//		System.out.println(str);
//		//重新用utf-8解码
		
		String str = "&#x8fa3;&#x6912;&#x7c89;&#x6253;&#x591a;&#x5c11;&#x5206;"; 
//        String str = "&#23665;&#19996;&#20020;&#27778;&#19968;" //分割时用"&#"，向整数转换时用Integer.parseInt(xx,10);
        String[] strs = str.split("&#x");
        StringBuilder sb = new StringBuilder();
        int temp;
        System.out.println(Arrays.toString(strs));
        for(int i=1; i<strs.length; i++) {
            temp = Integer.parseInt(strs[i].substring(0,strs[i].length()-1),16);
            System.out.println(temp + ";" + (char)temp);
            sb.append((char)temp);
        }
        System.out.println(sb.toString());
        
//        String s = "ooboo:and:foooo";
//        System.out.println(Arrays.toString(s.split(":")));
//        System.out.println(Arrays.toString(s.split("o")));
		
	}
}
