package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class FindProduct extends MyScanner {

	public static void main(String args[]) throws Exception {
		FindProduct in = new FindProduct();
		int n = in.nextInt();
		int a[] = new int[n];
		int mod = 1000000007;
		long sum = 1;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			sum = (sum * a[i]) % mod;
		}
		System.out.println(sum);
	}
}
