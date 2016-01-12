package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class PrateekAndHisFriends extends MyScanner {

	public static void main(String args) throws Exception {
		PrateekAndHisFriends in = new PrateekAndHisFriends();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			int c = in.nextInt();
			boolean flag = false;
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int first = 0;
			int sum = a[0];
			if (sum == c) {
				System.out.println("YES");
			} else {
				for (int i = 1; i < n; i++) {
					if ((sum + a[i]) > c) {
						sum = (sum + a[i]) - a[first];
						first = i;
					} else {
						if ((sum + a[i]) < c) {
							sum = sum + a[i];
						}
						if (a[i] == c) {
							flag = true;
							break;
						}
					}
					if (sum == c) {
						flag = true;
						break;
					}
				}
			}
			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO	");
			}
			t--;
		}
	}
}
