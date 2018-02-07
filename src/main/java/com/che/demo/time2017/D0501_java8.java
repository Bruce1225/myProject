package com.che.demo.time2017;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class D0501_java8 {
	
	public static void main(String[] args) {
/*		
		List l = new ArrayList();
		l.add("a111");
		l.add("b222");
		l.forEach(e -> System.out.println( e ));
		Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
		
		int a1[] = {1};
		String a2[] = {"",""};
		String a3[] = new String[3];
		int[][] a4 = new int[3][3];
*/		
		List<String> list = Arrays.asList(new String[] { "xxx", "aaa", "zzz", "eee", "yyy", "ccc" });
		List<String> list1 = list.stream().collect(Collectors.toList());

		list1.forEach(System.out :: println);
//		list.forEach(x -> System.out.println(x));
		
		BinaryOperator<String> accumulator=BinaryOperator.maxBy((x,y)->x.compareTo(y));
	    Optional<String> max = list.stream().reduce(accumulator);
	    System.out.println(max);
	    
	    Optional<String> max2 = list.stream().reduce((x,y)->x+y);
	    System.out.println(max2);
	    
	    long count = list.stream().count();
	    System.out.println(count);
	    System.out.println(list.stream().distinct().collect(Collectors.toList()));
	    
	    
	    
	    
//	    Encoder encoder = Base64.getEncoder();
//	    String str="abcd";
//	    String enc=encoder.encodeToString(str.getBytes());
//	    System.out.println(enc);
//
//	    System.out.println(new String(Base64.getDecoder().decode(enc)));
	    
	    Map<String,String> map= new HashMap<String, String>();
	    map.put("a", "aaa");
	    map.put("b", "bbb");
	    map.put("c", "ccc");
	    map.forEach((key,value)->System.out.println("key="+key+";value="+value));
	    
	    
	    
	}

}
