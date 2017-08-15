package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class W1_VolleyBallMatch extends MyScanner {

	public static void main(String args[]) throws Exception {
		W1_VolleyBallMatch in = new W1_VolleyBallMatch();
		long a = in.nextInt();
		long b = in.nextInt();
		System.out.println(in.sol(a, b));
	}

	private int sol(long n, long m) {
		// TODO Auto-generated method stub
		if (((n < 25) && (m < 25))
				|| (((n > 25) || (m > 25)) && (Math.abs(n - m) != 2))
				|| ((n == 24) && (m == 25)) || ((n == 25) && (m == 24))
				|| (n == m)) {
			// System.out.println(0);
			return 0;
		}
		int dp[][] = new int[26][26];
		int i, j;
		dp[0][0] = 1;
		for (i = 0; i <= 25; i++) {
			for (j = 0; j <= 25; j++) {
				if ((i + j) > 0) {
					if (i > 0) {
						dp[i][j] += dp[i - 1][j];
					}
					if (j > 0) {
						dp[i][j] += dp[i][j - 1];
					}
					dp[i][j] %= 1000000007;
				}
			}
		}

		if (n < m) {
			long t = m;
			m = n;
			n = t;
		}
		if (((n == 25) && (n > m))) {
			// System.out.println(dp[n - 1][m]);

			return dp[(int) n - 1][(int) m];
		}
		int ret = 0;
		ret = dp[24][24];
		ret = ((1 << 30) * ret * this.pw(Math.min(n, m) - 24)) % 1000000007;

		return ret;
	}

	public int pw(long k) {
		if (k < 0) {
			return 1;
		}
		if (k == 1) {
			return 2;
		}
		int q = this.pw(k / 2);
		q = ((1 << 30) * (q * q)) % 1000000007;
		if ((k % 2) == 0) {
			return (q + q) % 1000000007;
		} else {
			return q;
		}
	}
}
