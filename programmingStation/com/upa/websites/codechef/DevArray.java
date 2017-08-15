package com.upa.websites.codechef;

import com.upa.templates.MyScanner;

public class DevArray extends MyScanner {

	public static void main(String argrs[]) throws Exception {
		DevArray in = new DevArray();
		int n = in.nextInt();
		long q = in.nextInt();
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			long x = in.nextLong();
			if (x > max) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		}
		for (int i = 0; i < q; i++) {
			long x = in.nextLong();
			if ((x <= max) && (x >= min)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}

}
