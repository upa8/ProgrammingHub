package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class Longest_Common_Subsequence extends MyScanner {

	public static void main(String[] args) throws Exception {
		Longest_Common_Subsequence in = new Longest_Common_Subsequence();

		int n = in.nextInt();
		int m = in.nextInt();
		int[][] dp = new int[n + 1][m + 1];
		int[] a = new int[n + 1];
		int[] b = new int[m + 1];
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextInt();
		}
		for (int i = 1; i <= m; i++) {
			b[i] = in.nextInt();
		}

		// Build dp table
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (a[i] == b[j]) {
					dp[i][j] = dp[i - 1][j - 1] + 1;
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		// print the common subsequence
		// form the dp table
		// backtrack from bottom point
		int i = n;
		int j = m;
		String s = "";
		while ((i != 0) || (j != 0)) {
			if ((i > 0) && (j > 0) && (dp[i][j] == (dp[i - 1][j - 1] + 1))
					&& (a[i] == b[j])) {
				s = a[i] + " " + s;
				i--;
				j--;
			} else if ((i > 0) && (dp[i][j] == dp[i - 1][j])) {
				i--;
			} else {
				j--;
			}
		}
		System.out.println(s);
	}

}
