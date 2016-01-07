package com.upa.websites.codechef;

import java.util.HashMap;

import com.upa.templates.MyScanner;

/*
 *
 * Author : Pratik Upacharya
 * Question : https://www.codechef.com/OCT15/problems/ADTRI
 *
 */

public class ADTRI extends MyScanner {

	public static void main(String args[]) throws Exception {
		ADTRI in = new ADTRI();
		long t = in.nextLong();
		HashMap<Long, Long> hm = new HashMap<Long, Long>();
		for (long i = 1; i < 981183; i++) {
			hm.put(i * i, i);
		}
		while (t > 0) {
			long n = in.nextLong();
			long sum = n * n;
			boolean a = false;
			for (long k = n - 1; k > 0; k--) {
				long x = k * k;
				// System.out.println(x);
				long find = sum - x;
				// System.out.print("Find"+find);
				if (hm.containsKey(find)) {
					long y = hm.get(find);
					if (((y % 2) == 0) || ((k % 2) == 0)) {
						a = true;
						break;
					} else {
						continue;
					}
				} else {
					continue;
				}
			}
			if (a) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			t--;
		}
	}
}