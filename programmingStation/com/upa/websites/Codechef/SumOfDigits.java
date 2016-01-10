package com.upa.websites.codechef;

public class SumOfDigits extends MyScanner {

	public static void main(String args[]) throws Exception {
		SumOfDigits in = new SumOfDigits();
		int t = in.nextInt();
		while (t > 0) {
			long n = in.nextInt();
			long sum = 0;
			while (n > 0) {
				sum = sum + (n % 10);
				n = n / 10;
			}
			System.out.println(sum);
			t--;
		}
	}
}
