package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class Day6 extends MyScanner {

	public static void main(String args[]) throws Exception {
		Day6 in = new Day6();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}
