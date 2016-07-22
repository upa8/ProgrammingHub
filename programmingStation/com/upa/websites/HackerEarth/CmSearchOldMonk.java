package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

// Not passing all test cases
// Need to optimize this solution
public class CmSearchOldMonk extends MyScanner {
	public static void main(String args[]) throws Exception {
		CmSearchOldMonk in = new CmSearchOldMonk();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			long a[] = new long[n];
			long b[] = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextLong();
			}
			for (int i = 0; i < n; i++) {
				b[i] = in.nextLong();
			}
			int max = 0;
			for (int i = n - 1; i >= 0; i--) {
				long x = b[i];
				// System.out.println("x " + x);

				int first = 0;
				int last = n - 1;
				int mid = (first + last) / 2;

				// System.out.println("mid " + mid);
				int prevMid = mid;
				while (first < last) {

					// System.out.println("New mid " + mid + " a[mid] :" +
					// a[mid]);
					if (x >= a[mid]) {
						prevMid = mid;
						// go left
						last = mid;
						int semiMax = i - mid;
						if (max <= semiMax) {
							max = semiMax;
						}
					} else {
						// go right
						first = mid + 1;
					}
					mid = (first + last) / 2;
					// System.out.println(
					// " changes : first " + first + " last : " + last);

				}
			}
			System.out.println(max);
		}
	}

}
