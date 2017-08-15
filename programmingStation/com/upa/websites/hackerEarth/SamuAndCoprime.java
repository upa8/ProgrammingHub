package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class SamuAndCoprime extends MyScanner {
	static long[][][] dp = new long[19][163][1460];
	static int[] digit = new int[19];

	public static void main(String args[]) throws Exception {
		SamuAndCoprime in = new SamuAndCoprime();
		initArray();
		int t = in.nextInt();
		while (t-- > 0) {
			long l = in.nextLong();
			long r = in.nextLong();
			System.out.println(findCountUtil(r) - findCountUtil(l - 1));
		}
	}

	static long findCountUtil(long num) {
		long temp = num;
		int len = 0;
		if (temp == 0) {
			return 0;
		}
		for (len = 0; temp > 0; len++) {
			digit[len] = (int) (temp % 10);
			temp = temp / 10;
		}
		return findCount(len - 1, 0, 0, true);
	}

	static long findCount(int pos, int sum, int sqsum, boolean isMaxDigit) {
		if (pos == -1) {
			return gcd(sum, sqsum) == 1 ? 1 : 0;
		}
		if (!isMaxDigit && (dp[pos][sum][sqsum] != -1)) {
			return dp[pos][sum][sqsum];
		}
		int lastDigit;
		if (isMaxDigit) {
			lastDigit = digit[pos];
		} else {
			lastDigit = 9;
		}
		long ans = 0;
		for (int i = 0; i <= lastDigit; i++) {
			ans += findCount(pos - 1, sum + i, sqsum + (i * i),
					isMaxDigit && (i == lastDigit));
		}
		if (!isMaxDigit) {
			dp[pos][sum][sqsum] = ans;
		}
		return ans;
	}

	static long gcd(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			if ((a % b) == 0) {
				return b;
			}
			return gcd(a % b, b);
		} else {
			if ((b % a) == 0) {
				return a;
			}
			return gcd(a, b % a);
		}
	}

	static void initArray() {
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 163; j++) {
				for (int k = 0; k < 1460; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
	}

}
