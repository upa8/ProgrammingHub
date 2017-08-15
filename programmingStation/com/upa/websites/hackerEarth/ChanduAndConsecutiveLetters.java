package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class ChanduAndConsecutiveLetters extends MyScanner

{
	public static void main(String args[]) throws Exception {

		ChanduAndConsecutiveLetters in = new ChanduAndConsecutiveLetters();
		int t = in.nextInt();
		while (t > 0) {
			StringBuilder ans = new StringBuilder();
			String str = in.nextToken();
			ans.append(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i - 1) == str.charAt(i)) {
					continue;
				} else {
					ans.append(str.charAt(i));
				}
			}

			System.out.println(ans.toString());
			t--;
		}
	}
}
