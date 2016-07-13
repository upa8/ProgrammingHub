package com.upa.websites.uva;

import com.upa.templates.MyScanner;

public class Problem_3n extends MyScanner {
	public static void main(String args[]) throws Exception {
		Problem_3n in = new Problem_3n();
		String first = in.nextToken();
		if (!first.equals(" ")) {
			long i = Integer.parseInt(first);
			long j = in.nextLong();
			long maxLength = 0;
			long min = Math.min(i, j);
			long max = Math.max(i, j);
			for (long k = min; k <= max; k++) {
				long count = in.cycleLength(k);
				maxLength = Math.max(count, maxLength);
			}
			System.out.println(i + " " + j + " " + maxLength);
		}

	}

	public long cycleLength(long n) {
		int count = 1;
		while (n != 1) {
			if ((n % 2) == 0) {
				n = n / 2;
			} else {
				n = 3 * n;
				n += 1;
			}
			count++;
		}
		return n;
	}
}
