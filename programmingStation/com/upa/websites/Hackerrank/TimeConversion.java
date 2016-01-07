package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class TimeConversion extends MyScanner {
	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TimeConversion in = new TimeConversion();
		String time = in.nextToken();
		int hh = 0;
		int a = time.charAt(0) - '0';
		int b = time.charAt(1) - '0';
		hh = (a * 10) + b;
		if (time.charAt(time.length() - 2) == 'P') {

			if (hh < 12) {
				hh = hh + 12;
			}
			System.out.println(hh + time.substring(2, (time.length() - 2)));
		} else {
			if (hh == 12) {
				System.out
						.println("00" + time.substring(2, (time.length() - 2)));
			} else {
				System.out.println(time.substring(0, (time.length() - 2)));
			}
		}

	}
}
