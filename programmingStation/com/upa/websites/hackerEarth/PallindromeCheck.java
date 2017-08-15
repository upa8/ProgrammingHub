package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class PallindromeCheck extends MyScanner {

	public static void main(String args[]) throws Exception {
		PallindromeCheck in = new PallindromeCheck();
		String input = in.nextToken();
		System.out.println(in.sol(input));
	}

	private String sol(String input) {
		// TODO Auto-generated method stub
		String result = "NO";
		int length = input.length();
		if (length == 1) {
			result = "YES";
			return result;
		}
		int type = length % 2;
		int oddEven = 0;
		if (type == 0) {
			oddEven = length / 2;
		} else {
			oddEven = (length / 2) + 1;
		}
		for (int i = 0; i < oddEven; i++) {
			if (input.charAt(i) == input.charAt(length - i - 1)) {
				continue;
			} else {
				result = "NO";
				return result;
			}
		}
		result = "YES";
		return result;
	}
}
