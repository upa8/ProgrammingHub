package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class ModifyTheString extends MyScanner {

	public static void main(String args[]) throws Exception {
		ModifyTheString in = new ModifyTheString();
		String str = in.nextToken();
		StringBuilder fstr = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			int y = 0;
			if (x > 96) {
				y = 1;
				x = (x - 96) + 64;
			} else {
				x = (x - 64) + 96;
			}
			fstr.append((char) x);

		}
		System.out.println(fstr);

	}
}
