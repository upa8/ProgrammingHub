package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class SherlockAndArray extends MyScanner {

	public static void main(String[] args) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		SherlockAndArray in = new SherlockAndArray();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(in.nextToken());
				sum += a[i];
			}
			int leftSum = 0;
			int rightSum = sum;
			boolean flag = false;

			for (int i = 0; i < n; i++) {
				rightSum -= a[i];
				if (leftSum == rightSum) {
					flag = true;
					break;
				}
				leftSum += a[i];

			}
			if (flag == true) {
				System.out.println("YES");

			} else {
				System.out.println("NO");

			}
			t--;
		}
	}
}
