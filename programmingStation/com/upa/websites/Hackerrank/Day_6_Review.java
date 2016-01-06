package com.upa.websites.Hackerrank;

public class Day_6_Review extends MyScanner {

	public static void main(String args[]) throws Exception {
		Day_6_Review in = new Day_6_Review();
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
