package com.upa.websites.hackerrank;

import java.math.BigInteger;
import java.util.ArrayList;

import com.upa.templates.MyScanner;

public class FibonacciModified extends MyScanner {

	public static void main(String args[]) throws Exception {

		FibonacciModified in = new FibonacciModified();
		String a = in.nextToken();
		String b = in.nextToken();
		int n = in.nextInt();
		// long arr[] = new long[n];
		ArrayList<String> arr = new ArrayList<String>();
		arr.add(a);
		arr.add(b);
		BigInteger c = new BigInteger(b);
		for (int i = 1; i < (n - 1); i++) {
			c = (c.multiply(c));
			BigInteger d = new BigInteger(arr.get(i - 1));
			c = c.add(d);
			arr.add(c.toString());
			// = ((arr[i - 1] * arr[i - 1])
			// + arr[i - 2]);
		}
		System.out.println(arr.get(n - 1));
	}
}
