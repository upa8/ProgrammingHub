package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class CompareTriplets extends MyScanner {

	public static void main(String args[]) throws Exception {
		CompareTriplets in = new CompareTriplets();
		int a[] = new int[3];
		int b[] = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			b[i] = in.nextInt();
		}
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < 3; i++) {
			if ((a[i] > b[i]) && (a[i] != b[i])) {
				alice++;
			}
			if ((a[i] < b[i]) && (a[i] != b[i])) {
				bob++;
			}
		}
		System.out.println(alice + " " + bob);

	}

}
