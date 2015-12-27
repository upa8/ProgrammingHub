package com.upa.websites.Codeforces;

import com.upa.websites.Hackerrank.MyScanner;

public class A30 extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		A30 in = new A30();
		long a = in.nextLong();
		long b = in.nextLong();
		long n = in.nextLong();
		if ((a == 0) && (b == 0)) {
			System.out.println(1);
		} else {
			if ((a == 0) && (b != 0)) {
				System.out.println("No solution");
			} else {
				if ((a != 0) && (b == 0)) {
					System.out.println(0);
				} else {
					if ((b % a) != 0) {
						System.out.println("No solution");

					} else {
						if (((a * b) < 0) && ((n % 2) == 0)) {
							System.out.println("No solution");
						} else {
							long outputSign = (2 * (((a * b) >> 0))) - 1;
							long sol = (int) (outputSign * Math.pow(
							        ((1.0 * outputSign * b) / a), (1.0 / n)));

							long lhs = a, lhsP = a, lhsN = a;

							for ( int k = 0 ; k < n ; k++ ) {
								lhs *= sol;
								lhsP *= (sol + 1);
								lhsN *= (sol - 1);
							}

							if (lhs == b) {
								System.out.println(sol);
							} else if (lhsP == b) {
								System.out.println(sol + 1);
							} else if (lhsN == b) {
								System.out.println(sol - 1);
							} else {
								System.out.println("No solution");
							}
						}
					}
				}
			}
		}
	}
}
