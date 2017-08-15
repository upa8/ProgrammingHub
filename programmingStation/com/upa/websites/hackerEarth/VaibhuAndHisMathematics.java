package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class VaibhuAndHisMathematics extends MyScanner {

	public static void main(String argrs[]) throws Exception {
		VaibhuAndHisMathematics in = new VaibhuAndHisMathematics();
		int mod = 1000000007; // 10^9+7
		int maxN = 1000001; // 10^6
		long dp[] = new long[maxN];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < maxN; i++) {
			dp[i] = (i - 1) * dp[i - 2];

			dp[i] += dp[i - 1];
			dp[i] %= mod;
		}
		int t = in.nextInt();
		while (t-- > 0) {
			int x = in.nextInt();
			System.out.println(dp[x]);
		}
	}

}
