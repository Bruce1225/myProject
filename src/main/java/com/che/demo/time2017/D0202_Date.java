package com.che.demo.time2017;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D0202_Date {

	public static void main(String[] args) {
		Long currentDate = Calendar.getInstance().getTimeInMillis();
		System.out.println(currentDate);

		System.out.println(new Date(1502351182141L));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		System.out.println(sdf.format(new Date(1502351182141L)));
		System.out.println("CLIENTTIME:" + sdf.format(new Date(1502681291355L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502681291351L)));
		System.out.println("458096_S30--	CLIENTTIME:" + sdf.format(new Date(1502692631388L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502692206615L)));
		
//		System.out.println("100292_S01--	CLIENTTIME:" + sdf.format(new Date(1502785175029L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502785506106L)));
//		System.out.println("100292_S01--	CLIENTTIME:" + sdf.format(new Date(1502782500374L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502786432218L)));
		
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502700278920L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502700612245L)));
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502787554465L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502787887762L)));
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502788016549L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502701950387L)));
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502788442959L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502702376796L)));
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502849824951L)) + ";  	SERVERTIME :" + sdf.format(new Date(1502763758772L)));
		
		System.out.println("100292_S03--	CLIENTTIME:" + sdf.format(new Date(1502789798503L)) + ";  	SERVERTIME :" + sdf.format(new Date(1503134795921L)));
		
	}
}
