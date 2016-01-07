package com.upa.websites.Hackerrank;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class TwoStrings extends MyScanner {

	public static void main(String args[]) throws Exception {
		TwoStrings in = new TwoStrings();
		int n = in.nextInt();
		while (n > 0) {
			String firstString = in.nextToken();
			String secondString = in.nextToken();
			int firstStringLength = firstString.length();
			int secondStringLength = secondString.length();
			boolean found = false;
			int a[] = new int[255];
			Arrays.fill(a, 0);

			for (int i = 0; i < firstStringLength; i++) {
				a[firstString.charAt(i)] = 1;
			}
			for (int j = 0; j < secondStringLength; j++) {
				if (a[secondString.charAt(j)] == 1) {
					found = true;
					break;
				}
			}
			if (found) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			n--;
		}

	}
}
