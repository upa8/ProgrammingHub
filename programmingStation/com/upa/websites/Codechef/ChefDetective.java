package com.upa.JunitExamples;

import java.util.Arrays;

public class ChefDetective extends MyScanner {

	public static void main(String args[]) throws Exception {

		ChefDetective in = new ChefDetective();
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		Arrays.fill(b, 0);
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			a[i] = x;
			if (x != 0) {
				b[x - 1] = 1;
			} else {
				b[i] = 1;
			}
		}
		for (int i = 0; i < n; i++) {
			// System.out.print(b[i]);
			if (b[i] == 0) {
				System.out.print(i + 1 + " ");
			}

		}
	}
}
