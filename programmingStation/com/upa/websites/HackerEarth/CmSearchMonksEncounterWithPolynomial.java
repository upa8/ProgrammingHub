package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class CmSearchMonksEncounterWithPolynomial extends MyScanner {

	public static void main(String args[]) throws Exception {
		CmSearchMonksEncounterWithPolynomial in = new CmSearchMonksEncounterWithPolynomial();
		int t = in.nextInt();
		while (t > 0) {
			t--;
			System.out.println("Test" + t);
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			long k = in.nextLong();
			// Solution 1
			for (int i = 0; i < k; i++) {
				long y = (a * i * i) + (b * i) + c;
				if (y >= k) {
					System.out.println(i);
					break;
				} else {
					continue;
				}

			}
			// Solution 2
			// Use binary search to find value of x

		}
	}
}
