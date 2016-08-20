package com.upa.testing;

import com.upa.templates.MyScanner;

public class VitaSum extends MyScanner {
	static long mod = 1000000007;

	public static void main(String args[]) throws Exception {
		VitaSum in = new VitaSum();
		long n = in.nextLong();
		long k = in.nextLong();
		long ans = 0;
		long current = 0;
		for (int i = 0; i <= k; i++) {
			current = in.binomialCoeff(n, i);
			if ((i % 2) == 0) {
				ans = (ans + current) % mod;
			}
		}
		System.out.println(ans);
	}

	// less efficient method
	public long binomialCoeff(long n, long k) {
		long res = 1;
		if (k > (n - k)) {
			k = n - k;
		}
		for (int i = 0; i < k; ++i) {
			res = (res * (n - i)) % mod;
			res /= (i + 1);
		}
		return res;
	}
}
