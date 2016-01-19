package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class MonkInTheGrassFields extends MyScanner {

	public static void main(String args[]) throws Exception {

		MonkInTheGrassFields in = new MonkInTheGrassFields();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a[][] = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = in.nextInt();
					// Add into row
					a[i][n] = a[i][j] + a[i][n];
					// add into coloum
					a[n][j] = a[i][j] + a[n][j];
				}
			}
			for (int i = 0; i < n; i++) {
				System.out.println(a[i][n] + " : " + a[n][i]);
			}
			long sum = 0;
			while (k > 0) {
				System.out.println("After " + k);
				int minRow = 999999;
				int rowIndex = 0;
				int colIndex = 0;
				int minCol = 999999;
				// Find minimum of all rows and colums
				for (int i = 0; i < n; i++) {
					if (minRow >= a[i][n]) {
						minRow = a[i][n];
						rowIndex = i;
					}
					if (minCol >= a[n][i]) {
						minCol = a[n][i];
						colIndex = i;
					}
				}
				System.out.println(minRow + " " + minCol);
				// IF minimmu is colom then
				if (minRow >= minCol) {
					sum = sum + minCol;
					// Now update colum by n and all rows by 1

					for (int j = 0; j < n; j++) {
						a[j][n] = a[j][n] + 1;
					}
					a[n][colIndex] = a[n][colIndex] + n;

				} else {
					// If minimum is row then
					sum = sum + minRow;
					// now update row by n and all col by 1
					for (int j = 0; j < n; j++) {
						a[n][j] = a[n][j] + 1;
					}
					a[rowIndex][n] = a[rowIndex][n] + n;
				}
				k--;
			}
			System.out.println(sum);

			t--;
		}
	}
}
