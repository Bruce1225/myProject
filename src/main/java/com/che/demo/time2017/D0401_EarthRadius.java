package com.che.demo.time2017;

public class D0401_EarthRadius {

	private static double EARTH_RADIUS = 6378137; // 地球半径 (m)
	public static void main(String[] args) {
//		Double lat1 = 36.245359982486605;
//		Double long1 = 120.43462893878447;
//		Double lat2=	34.59401455444556;
//		Double long2=	120.43462893878447;//119.07333195135142;

		Double lat1 = 31.319119228343;
		Double long1 = 121.44550218516;
		Double lat2 = 31.250486927044;
		Double long2 = 121.42326837538;//119.07333195135142;
		
		Double lat1Radian = lat1 * Math.PI / 180.0;
		Double lat2Radian = lat2 * Math.PI / 180.0;
		Double long1Radian = long1 * Math.PI / 180.0;
		Double long2Radian = long2 * Math.PI /180.0;
	   
		double a = Math.abs(lat1Radian - lat2Radian);  //国内的只会是北半球，不用考虑相加问题
		double b = Math.abs(long1Radian - long2Radian);  
		double sa2 = Math.sin(a / 2.0);  
		double sb2 = Math.sin(b / 2.0);  
		double d = 2 * EARTH_RADIUS * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1Radian) * Math.cos(lat2Radian) * sb2 * sb2));  
	   System.out.println(d);

		sa2 = Math.sin(a / 2.0);  
		sb2 = Math.sin(b / 2.0);  
	   double h  = EARTH_RADIUS * ((Math.sin(a/2) * Math.sin(a/2)) + Math.cos(lat1Radian) * Math.cos(lat2Radian) * Math.sin(b/2) * Math.sin(b/2));
	   System.out.println(h);
	   
	   
	   
//	afis3
////       double a, b; 
//       lat1 = lat1 * Math.PI / 180.0;  
//       lat2 = lat2 * Math.PI / 180.0;  
//       a = lat1 - lat2;  
//       b = (long1 - long2) * Math.PI / 180.0;  
////       double d;  
////       double sa2, sb2;  
//       sa2 = Math.sin(a / 2.0);  
//       sb2 = Math.sin(b / 2.0);  
//       d = 2 * EARTH_RADIUS * Math.asin(Math.sqrt(sa2 * sa2 + Math.cos(lat1)  
//                       * Math.cos(lat2) * sb2 * sb2));  
//	   System.out.println(d);
       double d2 = 2 * EARTH_RADIUS * Math.asin(Math.sqrt(Math.sin(((lat1-lat2) * Math.PI / 180.0) / 2.0) * Math.sin(((lat1-lat2) * Math.PI / 180.0) / 2.0) 
    		   + Math.cos(lat1 * Math.PI / 180.0)  
       * Math.cos(lat2 * Math.PI / 180.0) *  Math.sin(((long1 - long2) * Math.PI / 180.0) / 2.0) *  Math.sin(((long1 - long2) * Math.PI / 180.0) / 2.0)));  
	   System.out.println(d2);
	}
}
