package com.upa.websites.Hackerrank;

import java.util.HashMap;

/*
 * Question link :
 * 	https://www.hackerrank.com/contests/hourrank-4/challenges/new-year-chaos
 *
 *	Status : Incomplete logic
 */
public class NewYearChaos extends MyScanner {
	public static void main() throws Exception {
		NewYearChaos in = new NewYearChaos();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int q[] = new int[n];
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				q[i] = Integer.parseInt(in.nextToken());
				hm.put(i, q[i]);
			}
			for (int i = 0; i < n; i++) {

			}
			t--;
		}

	}
}
