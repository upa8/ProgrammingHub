package com.upa.websites.codechef;

public class InTest extends MyScanner {

	public static void main(String args[]) throws Exception {
		InTest in = new InTest();
		long n = in.nextLong();
		long k = in.nextLong();
		long count = 0;
		while (n > 0) {
			int m = in.nextInt();
			if ((m % k) == 0) {
				count++;
			}
			n--;
		}
		System.out.println(count);
	}
}
