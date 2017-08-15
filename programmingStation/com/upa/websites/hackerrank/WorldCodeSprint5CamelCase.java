package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class WorldCodeSprint5CamelCase extends MyScanner {

	public static void main(String args[]) throws Exception {
		WorldCodeSprint5CamelCase in = new WorldCodeSprint5CamelCase();
		String str = in.nextToken();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			if ((x >= 65) && (x <= 90)) {
				count++;
			}
			// System.out.println(str.charAt(i) + " " + x);
		}
		count = count + 1;
		System.out.println(count);
	}
}
