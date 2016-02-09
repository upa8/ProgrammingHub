package com.upa.cryptography;

import com.upa.templates.MyScanner;

public class RailFence extends MyScanner {

	public static void main(String args[]) throws Exception {
		RailFence in = new RailFence();
		// take rail
		int rail = in.nextInt() - 1;
		// take plainText
		String plainText = in.nextToken();
		int plainTextLength = plainText.length();
		int mover = 1;
		// Now get the col of matrix
		int col = plainTextLength;
		int m = 0, n = 0;
		char railMat[][] = new char[rail + 1][col + 1];
		in.createMatrix(railMat, rail, col);
		// MainLogic
		for (int i = 0; i < plainTextLength; i++) {
			railMat[m][n] = plainText.charAt(i);
			n++;
			m = m + mover;
			if (((m) % (rail)) == 0) {
				mover = -mover;
			}
		}
		// Logic ends here

		System.out.println(in.resultString(railMat, rail, col));

	}

	public static void createMatrix(char railMat[][], int rail, int col) {

		for (int i = 0; i < (rail + 1); i++) {
			for (int j = 0; j < (col + 1); j++) {
				railMat[i][j] = ' ';
			}
		}
	}

	public static String resultString(char[][] railMat, int rail, int col) {
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < (rail + 1); i++) {
			for (int j = 0; j < (col + 1); j++) {
				System.out.print(railMat[i][j] + " ");
				if (railMat[i][j] != ' ') {
					ans.append(railMat[i][j]);
				}

			}
			System.out.println();
		}
		return ans.toString();
	}
}
