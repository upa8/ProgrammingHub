package com.upa.websites.codechef;

import java.math.BigInteger;
import java.util.HashMap;

public class SmallFactorials extends MyScanner {

	public static void main(String args[]) throws Exception {
		SmallFactorials in = new SmallFactorials();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// Store factorials into hashmap
		hm.put(1, "1");
		BigInteger fac = BigInteger.ONE;
		for (int i = 2; i <= 100; i++) {
			fac = fac.multiply(BigInteger.valueOf(i));
			hm.put(i, fac.toString());
		}
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			System.out.println(hm.get(n));
			t--;
		}
	}
}
