package com.upa.websites.Codechef;

import com.upa.websites.Hackerrank.MyScanner;

public class BankRob extends MyScanner {
	public static void main(String[] args) throws Exception {
		BankRob in = new BankRob();
		int n = in.nextInt();
		while ( n > 0 ) {
			int m = Integer.parseInt(in.nextToken());
			float rate = Float.parseFloat(in.nextToken());
			float marr[] = new float[m];
			if (m == 1) {
				System.out.printf("1000000000.0 0.0");
			} else {
				for ( int j = 0 ; j < m ; j++ ) {
					marr[j] = (float) (1000000000 * Math.pow(rate, j));
				}
				double diff = 0;
				for ( int k = m - 1 ; k > 0 ; k-- ) {
					diff = marr[k] - diff;
				}
				System.out.printf("%1.1f %1.1f", 1000000000.0 - diff, diff);
			}
			n--;
		}
	}
}
