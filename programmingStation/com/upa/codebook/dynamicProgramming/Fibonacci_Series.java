package com.upa.codebook.dynamicProgramming;

public class Fibonacci_Series {

	public long fiboRecursive(long n) {
		if (n < 2) {
			return 1;
		}
		return this.fiboRecursive(n - 1) + this.fiboRecursive(n - 2);
	}

	public long fiboDP(long n) {
		long DP[] = new long[(int) n];
		DP[0] = 1;
		DP[1] = 1;
		for (int i = 2; i < n; i++) {
			DP[i] = DP[i - 1] + DP[i - 2];
		}
		return DP[(int) n];
	}

}
