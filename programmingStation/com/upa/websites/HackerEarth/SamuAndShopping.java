package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class SamuAndShopping extends MyScanner {

	public static void main(String args[]) throws Exception {
		SamuAndShopping in = new SamuAndShopping();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int a[][] = new int[n][3];
			for (int i = 0; i < n; i++) {
				a[i][0] = in.nextInt();
				a[i][1] = in.nextInt();
				a[i][2] = in.nextInt();
			}
			System.out.println(in.sol(n, a));
			t--;
		}
	}

	private int sol(int n, int[][] a) {
		// TODO Auto-generated method stub
		int dp[][] = new int[n][3];
		dp[0][0] = a[0][0];
		dp[0][1] = a[0][1];
		dp[0][2] = a[0][2];
		for (int i = 1; i < n; i++) {
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + a[i][0];
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + a[i][1];
			dp[i][2] = Math.min(dp[i - 1][1], dp[i - 1][0]) + a[i][2];
		}

		int ans = Math.min((Math.min(dp[n - 1][0], dp[n - 1][1])),
				dp[n - 1][2]);

		return ans;
	}

}
