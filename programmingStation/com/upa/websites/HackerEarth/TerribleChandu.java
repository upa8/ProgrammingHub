package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

/*
 * Questions :
 */

public class TerribleChandu extends MyScanner {

	public static void main(String args[]) throws Exception {

		TerribleChandu in = new TerribleChandu();
		int t = in.nextInt();
		while (t > 0) {
			StringBuilder ans = new StringBuilder();
			String str = in.nextToken();
			ans.append(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {

				ans.append(str.charAt(i));

			}

			System.out.println(ans.reverse().toString());
			t--;
		}
	}
}
