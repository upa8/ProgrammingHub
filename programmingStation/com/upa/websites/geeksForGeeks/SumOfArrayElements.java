package com.upa.websites.geeksForGeeks;

import com.upa.templates.MyScanner;

public class SumOfArrayElements extends MyScanner {

	public static void main(String args[]) throws Exception {
		SumOfArrayElements in = new SumOfArrayElements();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += Integer.parseInt(in.nextToken());
			}
			System.out.println(sum);
		}
	}
}
