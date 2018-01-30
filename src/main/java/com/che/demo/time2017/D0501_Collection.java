package com.che.demo.time2017;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class D0501_Collection {
	
	public static void main(String[] args) {
/*		
		Map map = new HashMap();
	    Integer ONE = new Integer(1);
	    args = new String[]{"aa","bb","cc"};
	    for (int i=0, n=args.length; i<n; i++) {
	      String key = args[i];
	      Integer frequency = (Integer)map.get(key);
	      if (frequency == null) {
	        frequency = ONE;
	      } else {
	        int value = frequency.intValue();
	        frequency = new Integer(value + 1);
	      }
	      map.put(key, frequency);
	    }
	    System.out.println(map);
	    Map sortedMap = new TreeMap(map);
	    System.out.println(sortedMap);
	    */
		
//		Map map = new HashMap();
//		map.put("key1","lisi1");
//		map.put("key2","lisi2");
//		map.put("key3","lisi3");
//		map.put("key4","lisi4");  
//		//先获取map集合的所有键的set集合，keyset（）
//		Iterator it = map.keySet().iterator();
//		 //获取迭代器
//		while(it.hasNext()){
//		Object key = it.next();
//		System.out.println(map.get(key));
//		}
		
		Map map = new HashMap();
		map.put("key1","lisi1");
		map.put("key2","lisi2");
		map.put("key3","lisi3");
		map.put("key4","lisi4");
		//将map集合中的映射关系取出，存入到set集合
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
		Entry e =(Entry) it.next();
		System.out.println("键"+e.getKey () + "的值为" + e.getValue());
		}
		
		Object o;
//		o.wait();
	}

}
