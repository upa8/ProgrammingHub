package com.upa.codebook.dynamicProgramming;

/*
 * Problem :
 *Let us say that you are given a number N, you've to find the number of
 *different ways to write it as the sum of 1, 3 and 4.
	For example, if N = 5, the answer would be 6.

	1 + 1 + 1 + 1 + 1
	1 + 4
	4 + 1
	1 + 1 + 3
	1 + 3 + 1
	3 + 1 + 1

	Sub-problem:
	DPn be the number of ways to write N as the sum of 1, 3, and 4.
	Finding recurrence: Consider one possible solution, n = x1 + x2 + ... xn.
	If the last number is 1, the sum of the remaining numbers should be n - 1.
	So, number of sums that end with 1 is equal to DPn-1..
	Take other cases into account where the last number is 3 and 4.
	The final recurrence would be:

	DPn = DPn-1 + DPn-3 + DPn-4.
	Take care of the base cases. DP0 = DP1 = DP2 = 1, and DP3 = 2.

	Implementation:

	DP[0] = DP[1] = DP[2] = 1; DP[3] = 2;
	for (i = 4; i <= n; i++) {
	  DP[i] = DP[i-1] + DP[i-3] + DP[i-4];
	}
	The technique above, takes a bottom up approach and uses memoization
	to not compute results that have already been computed.
 */

public class DifferentWayToFindSum {

	// Recurrence will change with respect to
	// what numbers we get for finding the sum
	public void findWays(int n) {
		int[] DP = new int[n];
		DP[0] = DP[1] = DP[2] = 1;
		DP[3] = 2;
		for (int i = 4; i <= n; i++) {
			DP[i] = DP[i - 1] + DP[i - 3] + DP[i - 4];
		}
	}
}
