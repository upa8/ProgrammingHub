package com.upa.websites.hackerEarth;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class ChanduAndHisGF extends MyScanner {

	public static void main(String args[]) throws Exception {
		ChanduAndHisGF in = new ChanduAndHisGF();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(in.nextToken());
			}

			Arrays.sort(a);

			for (int i = n - 1; i >= 0; i--) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			t--;
		}
	}
}
