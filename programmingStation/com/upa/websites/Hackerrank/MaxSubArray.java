package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class MaxSubArray extends MyScanner {
	public static void main(String args[]) throws Exception {
		MaxSubArray in = new MaxSubArray();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			int maxSumEnd = 0;
			int maxSumSoFar = 0;
			int totalMax = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(in.nextToken());
				// For noncontigious maximus sum
				if (a[i] > 0) {
					totalMax += a[i];
				}

				// for contigious maximus sum
				maxSumEnd += a[i];
				if (maxSumEnd < 0) {
					maxSumEnd = 0;
				} else {
					if (maxSumSoFar < maxSumEnd) {
						maxSumSoFar = maxSumEnd;
					}
				}
			}
			if ((totalMax > 0) && (maxSumSoFar > 0)) {

				System.out.println(maxSumSoFar + " " + totalMax);

			} else {
				System.out.println(a[0] + " " + a[0]);

			}
			t--;
		}
	}

}
