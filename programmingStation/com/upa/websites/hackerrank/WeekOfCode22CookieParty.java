package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class WeekOfCode22CookieParty extends MyScanner {

	public static void main(String args[]) throws Exception {
		WeekOfCode22CookieParty in = new WeekOfCode22CookieParty();
		long n = in.nextLong();
		long m = in.nextLong();
		// System.out.println(x);
		if ((m > n) && (m != n)) {
			long x = m / n;
			System.out.println(((x + 1) * n) - m);
		} else {
			System.out.println(Math.abs(m - n));
		}

	}
}
