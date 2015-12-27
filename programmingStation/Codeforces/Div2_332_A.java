package Codeforces;

import Hackerrank.MyScanner;

public class Div2_332_A extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Div2_332_A in = new Div2_332_A();
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long sum = 0;
		// minimum weight 
		long first = 0;
		long second = 0;
		long third = 0;
		if (a > b) {
			sum = sum + b;
			first = b + (2 * a);
			second = c + a;
			third = (2 * c) + b;
		} else {
			sum = sum + a;
			first = a + (2 * b);
			second = c + b;
			third = (2 * c) + a;
		}
		sum = sum + min(first, second, third);
		System.out.println(sum);
	}

	public static long min(long a, long b, long c) {
		return Math.min(Math.min(a, b), c);
	}
}
