package com.upa.websites.Hackerrank;

import java.text.DecimalFormat;

import com.upa.templates.MyScanner;

public class PlusMinus extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PlusMinus in = new PlusMinus();
		int n = in.nextInt();
		float pos = 0;
		float neg = 0;
		float zero = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			if (num == 0) {
				zero += 1;
			} else if (num > 0) {
				pos += 1;
			} else {
				neg += 1;
			}
		}
		DecimalFormat f = new DecimalFormat("##.000");
		System.out.println(f.format((double) 1 / (n / pos)));
		System.out.println(f.format((double) 1 / (n / neg)));
		System.out.println(f.format((double) 1 / (n / zero)));

	}

}
