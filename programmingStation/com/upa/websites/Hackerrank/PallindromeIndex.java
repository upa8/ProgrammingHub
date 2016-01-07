package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class PallindromeIndex extends MyScanner {

	public static void main(String args[]) throws Exception {
		PallindromeIndex in = new PallindromeIndex();
		int n = in.nextInt();
		while (n > 0) {
			String str = in.nextToken();
			int l = str.length();
			int m = l - 1;
			boolean pallindrome = true;
			for (int i = 0; i < (l / 2); i++) {
				// System.out.println(str.charAt(m));
				// System.out.println(str.charAt(i));
				// System.out.println(str.charAt(i + 1));
				// System.out.println(str.charAt(m - 1));

				if (str.charAt(m) == str.charAt(i)) {
					m--;
				} else {
					if (str.charAt(i + 1) == str.charAt(m)) {
						System.out.println(i);
						pallindrome = false;
						break;
					} else {
						if (str.charAt(i) == str.charAt(m - 1)) {
							System.out.println(m);
							pallindrome = false;
							break;
						}
					}
				}
			}
			if (pallindrome) {
				System.out.println(-1);
			}
			n--;
		}
	}
}
