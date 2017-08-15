package com.upa.websites.leetCode;

import com.upa.templates.MyScanner;

public class P389FindDifference extends MyScanner {
	public static void main(String args[]) throws Exception {
		P389FindDifference in = new P389FindDifference();
		String s = in.nextToken();
		String t = in.nextToken();
		System.out.println(in.findTheDifference(s, t));
	}

	public char findTheDifference(String s, String t) {
		int length = s.length();
		int sumS = 0;
		int sumT = 0;
		for (int i = 0; i < length; i++) {
			sumS += (s.charAt(i) - 'a');
			sumT += (t.charAt(i) - 'a');
		}
		sumT += t.charAt(length);

		return (char) (sumT - sumS);
	}
}
