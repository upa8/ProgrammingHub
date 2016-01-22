package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class MonkAndMultiplication extends MyScanner {

	public static void main(String args[]) throws Exception {
		MonkAndMultiplication in = new MonkAndMultiplication();
		int t = in.nextInt();
		if (t <= 2) {
			System.out.println("-1");
		} else {
			int a[] = new int[t];
			int b[] = new int[4];
			for (int i = 0; i < t; i++) {
				a[i] = in.nextInt();
			}

		}
	}
}
