package com.upa.websites.codechef;

/*
 * Author : Pratik Upacharya
 * Question : https://www.codechef.com/OCT15/problems/SUBINC
 * 
 * 
 */

public class CountSubArrays extends MyScanner {

	public static void main(String args[]) throws Exception {
		CountSubArrays in = new CountSubArrays();
		int t = in.nextInt();
		while ( t > 0 ) {
			int n = in.nextInt();
			int v[] = new int[n];
			int b[] = new int[n];

			for ( int i = 0 ; i < n ; i++ ) {
				v[i] = Integer.parseInt(in.nextToken());
				b[i] = 1;
			}
			// Second Approach

			int count = 0;
			for ( int i = 0 ; i < n ; i++ ) {
				for ( int j = i ; j < n ; j++ ) {
					if (in.subinc(v, i, j)) {
						count++;
					}
				}
			}
			System.out.println(count);

			// First Approach
			/*
			 * for(int i=1; i<n; i++){ if(a[i]>a[i-1]) b[i]=1+b[i-1]; } long
			 * count = 0; for(int i=0; i<n; i++) count+=b[i];
			 * System.out.println(count);
			 */
			t--;
		}

	}

	boolean subinc(int a[], int i, int j) {
		if (i == j) {
			return true;
		}
		if (i > j) {
			return false;
		}
		if (a[i] > a[j]) {
			return false;
		}

		for ( int k = i ; k < j ; k++ ) {
			if (a[k + 1] < a[k]) {
				return false;
			}
		}
		return true;
	}

}
