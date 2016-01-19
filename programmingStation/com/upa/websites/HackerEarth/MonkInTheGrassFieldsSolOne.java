package com.upa.websites.hackerEarth;

import java.util.Arrays;
import java.util.Scanner;

public class MonkInTheGrassFieldsSolOne {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner h = new Scanner(System.in);
		int t = h.nextInt();
		while (t-- > 0) {
			int n = h.nextInt();
			int k = h.nextInt();
			int[][] a = new int[n][n];
			int[] r = new int[n];
			int[] c = new int[n];
			int[] sr = new int[n * 1000];
			int[] sc = new int[n * 1000];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = h.nextInt();
					r[i] += a[i][j];
					c[j] += a[i][j];
				}
			}
			long ans = (long) 1e18;
			Arrays.sort(r);
			Arrays.sort(c);
			for (int i = 0; i < k; i++) {
				Arrays.sort(r);
				Arrays.sort(c);
				int l = r[0];
				sr[i] = l;
				r[0] = l + n;
				int m = c[0];
				sc[i] = m;
				c[0] = m + n;
			}
			for (int i = 1; i < k; i++) {
				sc[i] += sc[i - 1];
				sr[i] += sr[i - 1];
			}
			for (int i = k; i >= 1; i--) {
				sr[i] = sr[i - 1];
				sc[i] = sc[i - 1];
			}
			sc[0] = 0;
			sr[0] = 0;
			for (int i = 0; i <= k; i++) {
				ans = Math.min(ans, sc[i] + sr[k - i] + ((1L) * (i * (k - i))));
			}
			System.out.println(ans);
		}
	}
}