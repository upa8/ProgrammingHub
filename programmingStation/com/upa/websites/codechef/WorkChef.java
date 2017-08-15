package com.upa.websites.codechef;

import java.util.HashMap;

public class WorkChef extends MyScanner {

	public static void main(String args[]) throws Exception {
		WorkChef in = new WorkChef();
		int q = in.nextInt();
		while (q > 0) {
			long l = in.nextLong();
			long r = in.nextLong();
			long k = in.nextLong();
			System.out.println(in.sol(l, r, k));
			q--;
		}
	}

	public long sol(long l, long r, long k) {
		if ((k == 0) || (k == 1)) {
			return ((r - l) + 1);
		}
		long count = 0;

		for (long i = l; i <= r; i++) {
			// System.out.println("i " + i);
			String str = String.valueOf(i);
			// System.out.println("str " + str);
			// System.out.println("Str length" + str.length());
			long s = 0;
			HashMap<Long, Long> hm = new HashMap<Long, Long>();
			hm.clear();
			for (int j = 0; j < str.length(); j++) {
				int p = str.charAt(j) - '0';
				long m = p;
				// System.out.println("m " + m);
				if (m != 0) {
					if (!hm.containsKey(m)) {
						// use division algorithm
						if ((i % m) == 0) {
							// System.out.println(" i " + i);
							hm.put(m, m);
							s++;
						}

					}
				}
				if (s == k) {
					System.out.println(" num " + i);
					count++;
					break;
				}
			}
		}
		return count;
	}
}
