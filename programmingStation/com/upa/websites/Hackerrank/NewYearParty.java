package com.upa.websites.Hackerrank;
/*
 * Question link :
 * 	https://www.hackerrank.com/contests/hourrank-4/challenges/new-year-party
 */

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class NewYearParty extends MyScanner {

	public static void main(String args[]) throws Exception {
		NewYearParty in = new NewYearParty();
		int n = in.nextInt();
		int t[] = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = Integer.parseInt(in.nextToken());
		}
		Arrays.sort(t);
		long time = t[0];
		for (int i = 1; i < n; i++) {
			if (t[i] == t[i - 1]) {
				time = time + 1;
			} else {
				if (time < t[i]) {
					time = t[i];
				} else {
					time++;
				}
			}
		}
		System.out.println(time);

	}

}
