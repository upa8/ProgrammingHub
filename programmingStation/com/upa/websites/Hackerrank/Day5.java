package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class Day5 extends MyScanner {
	public static void main(String args[]) throws Exception {
		Day5 in = new Day5();
		int t = in.nextInt();
		while (t > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			int sum = a + b;
			System.out.print(sum + " ");
			for (int i = 1; i < n; i++) {
				sum += (Math.pow(2, i) * b);
				System.out.print(sum + " ");
			}
			System.out.println();
			t--;
		}
	}
}
