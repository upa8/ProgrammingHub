package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class Factorial extends MyScanner {

	public static void main(String args[]) throws Exception {
		Factorial in = new Factorial();
		int l = in.nextInt();
		long sum = 1;
		for (int i = 1; i <= l; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}

}
