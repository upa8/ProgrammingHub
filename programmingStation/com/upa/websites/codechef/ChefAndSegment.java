package com.upa.websites.codechef;

import java.util.HashMap;

public class ChefAndSegment extends MyScanner {

	public static void main(String args[]) throws Exception {
		ChefAndSegment in = new ChefAndSegment();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			long input[] = new long[n];
			for (int i = 0; i < n; i++) {
				input[i] = in.nextLong();
			}
			System.out.println(in.sol(n, input));
		}
	}

	public long sol(int n, long[] input) {
		long finalAnswer = 0;
		for (int i = 0; i < n; ++i) {
			HashMap<Long, Long> hm = new HashMap<Long, Long>();
			for (int j = i; j < (n - 1); ++j) {
				hm.put(input[j], input[j]);
				long countPermutations = 0;
				for (int k = j + 1; k < n; ++k) {
					if (hm.containsKey(input[k])) {
						finalAnswer += (countPermutations
								* (countPermutations + 1)) / 2;
						countPermutations = 0;
					} else {
						++countPermutations;
					}
				}
				if (countPermutations != 0) {
					finalAnswer += (countPermutations * (countPermutations + 1))
							/ 2;
				}
			}
		}
		return finalAnswer;
	}

	// brute force solution
	public long sol1(int n, long[] input) {
		// Edge case
		if (n == 1) {
			return 0;
		}
		// if array is sorted then
		// directly reply with the formula
		// yet to fiqure out the formule
		//
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		// long dp[] = new long[n];
		long count = 0;
		for (int i = 0; i < (n - 1); i++) {
			a = i;
			System.out.println("A " + count + " i " + i);
			HashMap<Long, Long> hm = new HashMap<Long, Long>();
			hm.put(input[i], input[i]);
			// adding first element into hashmap
			for (int j = i; j < (n - 1); j++) {
				b = j;
				// adding second element into hashmap
				// add all elements from i to j into hashmap
				if (!hm.containsKey(input[j])) {
					hm.put(input[j], input[j]);

				}
				// now check for cd to n

				for (int l = j + 1; l < n; l++) {
					c = l;
					// if c itselft present then don't run the loop
					if (!hm.containsKey(input[c])) {

						for (int m = l; m < n; m++) {
							d = m;
							if (hm.containsKey(input[m])) {
								break;
							} else {
								// int p = a + 1;
								// int q = b + 1;
								// int r = c + 1;
								// int s = d + 1;
								// System.out.println("a " + p + " b " + q + " "
								// + " c " + r + " d " + s);
								count++;
							}

						} // end m loop
					}
				} // end l for loop
					//

			} // second loop ends here

		} // first loop ends here

		return count;
	}
}
