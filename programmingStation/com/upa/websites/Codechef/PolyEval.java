package com.upa.websites.codechef;

public class PolyEval extends MyScanner {

	public static void main(String args[]) throws Exception {
		PolyEval in = new PolyEval();
		int n = in.nextInt();
		long a[] = new long[n + 1];
		for (int i = 0; i <= n; i++) {
			a[i] = in.nextLong();
		}
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			long x = in.nextLong();
			System.out.println(in.sol(n, a, x));
		}
	}

	public long sol(int n, long[] a, long x) {
		long ans = a[0] % 786433;
		long mult = x % 786433;
		for (int j = 1; j <= n; j++) {
			ans = (ans % 786433) + (((a[j] % 786433)) * mult);
			mult = (mult * x) % 786433;
		}
		ans = ans % 786433;
		return ans;
	}

}
