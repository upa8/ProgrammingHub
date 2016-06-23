package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class ProjectEuler1 extends MyScanner {

	public static void main(String args[]) throws Exception {

		ProjectEuler1 in = new ProjectEuler1();
		int t = in.nextInt();
		while (t > 0) {
			long n = in.nextLong();
			n -= 1;
			System.out.println(
					((sum(n / 3) * 3) + (sum(n / 5) * 5)) - (sum(n / 15) * 15));

			t--;
		}
	}

	public static long sum(long num) {
		return (((num * ((num + 1))) / 2));
	}
}
