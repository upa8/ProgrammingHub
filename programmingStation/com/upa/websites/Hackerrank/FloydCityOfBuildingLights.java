package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class FloydCityOfBuildingLights extends MyScanner {

	static int n, m, q;
	static int[][] adj;

	public static void main(String args[]) throws Exception {
		FloydCityOfBuildingLights in = new FloydCityOfBuildingLights();

		n = in.nextInt();
		m = in.nextInt();

		adj = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adj[i][j] = 1 << 29;
			}
			adj[i][i] = 0;
		}

		for (int i = 0; i < m; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int c = in.nextInt();
			adj[a][b] = c;
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}

		q = in.nextInt();

		for (int i = 0; i < q; i++) {
			int a = in.nextInt() - 1;
			int b = in.nextInt() - 1;
			int res = adj[a][b];
			System.out.println(res == (1 << 29) ? -1 : res);
		}

	}
}
