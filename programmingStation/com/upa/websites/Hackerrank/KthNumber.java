package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

/*
 * Author : Pratik Upacharya
 * Question : https://www.hackerrank.com/contests/morgan-stanley-2015/challenges/wet-shark-and-kth-largest-number
 * Solution :
 * 		Use Persistent Segment tree to solve this problem .
 */
public class KthNumber extends MyScanner {
	public static void main(String args[]) throws Exception {
		KthNumber in = new KthNumber();
		int n = in.nextInt();
		int q = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(in.nextToken());
		}
		for (int i = 0; i < q; i++) {
			int l = Integer.parseInt(in.nextToken());
			int k = Integer.parseInt(in.nextToken());

			int count = 0;
			// Change this logic
			// Do the following operation in log(n) complexity
			for (int j = 0; j < n; j++) {
				if (count == k) {
					System.out.println(a[j]);
					break;
				}
				if (a[j] >= l) {
					count++;
				}
				if (count == k) {
					System.out.println(a[j]);
					break;
				}
			}
		}
	}
}
