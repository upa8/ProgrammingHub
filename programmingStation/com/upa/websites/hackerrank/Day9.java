package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class Day9 extends MyScanner {

	public static void main(String args[]) throws Exception {
		Day9 in = new Day9();
		long a = in.nextInt();
		long b = in.nextInt();
		long c = in.findGCD(a, b);
		System.out.println(c);
	}

	private static long findGCD(long number1, long number2) {
		/*
		 * // base case if (number2 == 0) { return number1; } return
		 * findGCD(number2, number1 % number2);
		 */
		long t;
		while (number2 != 0) {
			t = number2;
			number2 = number1 % number2;
			number1 = t;
		}
		return number1;
	}
}
