package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class CountDivisors extends MyScanner {

	public static void main(String args[]) throws Exception {
		CountDivisors in = new CountDivisors();
		int l = in.nextInt();
		int r = in.nextInt();
		int k = in.nextInt();
		int count = 0;
		for (int i = l; i <= r; i++) {
			if ((i % k) == 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
