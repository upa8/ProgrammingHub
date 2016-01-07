package com.upa.websites.Hackerrank;

import java.util.Calendar;

import com.upa.templates.MyScanner;

public class CountFriday13 extends MyScanner {
	public static void main(String args[]) throws Exception {
		CountFriday13 in = new CountFriday13();
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int startDay = in.nextInt();
			int startMonth = in.nextInt();
			int startYear = in.nextInt();
			Calendar startCal = Calendar.getInstance();
			startCal.set(Calendar.HOUR_OF_DAY, 0);
			startCal.set(Calendar.DAY_OF_MONTH, startDay);
			startCal.set(Calendar.MONTH, startMonth - 1);
			startCal.set(Calendar.YEAR, startYear);

			int endDay = in.nextInt();
			int endMonth = in.nextInt();
			int endYear = in.nextInt();
			Calendar endCal = Calendar.getInstance();
			endCal.set(Calendar.HOUR_OF_DAY, 23);
			endCal.set(Calendar.DAY_OF_MONTH, endDay);
			endCal.set(Calendar.MONTH, endMonth - 1);
			endCal.set(Calendar.YEAR, endYear);

			int count = 0;
			while (startCal.getTime().before(endCal.getTime())) {
				if ((startCal.get(Calendar.DAY_OF_WEEK) == 6)
						&& (startCal.get(Calendar.DAY_OF_MONTH) == 13)) {
					count++;
				}
				startCal.add(Calendar.DAY_OF_MONTH, 1);
			}
			System.out.println(count);
		}
	}

}
