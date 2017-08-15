package com.upa.websites.hackerEarth;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class ChanduAndHisGfReturns extends MyScanner {

	public static void main(String args[]) throws Exception {

		ChanduAndHisGfReturns in = new ChanduAndHisGfReturns();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int m = in.nextInt();
			long a[] = new long[n + m];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextLong();
			}
			for (int i = n; i < a.length; i++) {
				a[i] = in.nextLong();
			}
			Arrays.sort(a);
			for (int i = a.length - 1; i >= 0; i--) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			t--;
		}
	}
}
