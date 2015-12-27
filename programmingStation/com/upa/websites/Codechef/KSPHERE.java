package com.upa.websites.Codechef;

import java.util.Arrays;

public class KSPHERE extends MyScanner {

	public static void main(String args[]) throws Exception {

		KSPHERE in = new KSPHERE();
		// Taking Input
		int n = Integer.parseInt(in.nextToken());
		int m = Integer.parseInt(in.nextToken());
		int c = Integer.parseInt(in.nextToken());

		int a[] = new int[n];
		int b[] = new int[m];

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = Integer.parseInt(in.nextToken());
		}

		for ( int i = 0 ; i < m ; i++ ) {
			b[i] = Integer.parseInt(in.nextToken());
		}
		// Main Logic
		Arrays.sort(a);
		Arrays.sort(b);

	}

}
