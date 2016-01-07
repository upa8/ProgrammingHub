package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class DiagonalDifference extends MyScanner {
	public static void main(String args[]) throws Exception {

		MyScanner in = new MyScanner();
		int n = in.nextInt();
		int mat[][] = new int[n][n];
		long D1 = 0;
		long D2 = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				mat[i][j] = Integer.parseInt(in.nextToken());

			}

		}
		for (int i = 0; i < n; i++) {
			D1 += mat[i][i];
			D2 += mat[i][n - i - 1];
		}
		System.out.println(Math.abs((D1 - D2)));
	}
}
