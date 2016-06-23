package com.upa.websites.hackerrank;

import java.math.BigInteger;

import com.upa.templates.MyScanner;

public class ProjectEuler2 extends MyScanner {

	public static void main(String args[]) throws Exception {
		ProjectEuler2 in = new ProjectEuler2();
		int t = in.nextInt();

		while (t > 0) {
			BigInteger one = BigInteger.ONE;
			BigInteger zero = BigInteger.ZERO;
			BigInteger a = one;
			BigInteger even = one.add(one);
			BigInteger b = even;
			BigInteger sum = zero;
			BigInteger ans = zero;

			long value = in.nextLong();
			BigInteger n = BigInteger.valueOf(value);

			BigInteger i = even;
			int x = i.compareTo(n);
			while (x == -1) {
				sum = a.add(b);
				a = b;
				b = sum;
				BigInteger d = b.mod(even);
				i = b;
				x = i.compareTo(n);
				int y = d.compareTo(zero);

				if ((y == 0) && (x == -1)) {
					ans = ans.add(b);
				}

			}

			System.out.println(ans.add(even));
			t--;
		}
	}

}
