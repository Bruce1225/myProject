package com.che.demo.time2017;

import java.util.Calendar;

public class D202_Date {

	public static void main(String[] args) {
		Long currentDate = Calendar.getInstance().getTimeInMillis();
		System.out.println(currentDate);
	}
}
