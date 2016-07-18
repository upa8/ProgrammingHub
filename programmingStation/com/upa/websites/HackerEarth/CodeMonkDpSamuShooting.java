package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class CodeMonkDpSamuShooting extends MyScanner {

	public static void main(String args[]) throws Exception {
		CodeMonkDpSamuShooting in = new CodeMonkDpSamuShooting();
		int t = in.nextInt();
		int maxN = 1010;
		int maxW = 1010;

		while (t-- > 0) {
			int X = in.nextInt();
			int Y = in.nextInt();
			int N = in.nextInt();
			int W = in.nextInt();
			int P1 = in.nextInt();
			int P2 = in.nextInt();
			double DP[][] = new double[maxN][maxW];
			double p1 = 0.01 * P1;
			double p2 = 0.01 * P2;
			for (int i = 0; i <= N; i++) {
				DP[i][0] = 1;
			}
			for (int i = 1; i <= W; i++) {
				DP[0][i] = 0;
			}
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= W; j++) {
					DP[i][j] = Math.max(
							(p1 * DP[i - 1][Math.max(j - X, 0)])
									+ ((1 - p1) * DP[i - 1][Math.max(j, 0)]),
							(p2 * DP[i - 1][Math.max(j - Y, 0)])
									+ ((1 - p2) * DP[i - 1][Math.max(j, 0)]));
				}
			}
			System.out.printf("%.6f\n", DP[N][W] * 100);
		}

	}

}
