package com.upa.websites.hackerrank;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class WorldCodeSprint5StringConstruction extends MyScanner {

	public static void main(String args[]) throws Exception {
		WorldCodeSprint5StringConstruction in = new WorldCodeSprint5StringConstruction();
		int n = in.nextInt();
		while (n-- > 0) {
			String str = in.nextToken();
			HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
			for (int i = 0; i < str.length(); i++) {
				char s = str.charAt(i);
				if (!hm.containsKey(s)) {
					hm.put(s, 1);
				}
			}
			System.out.println(hm.size());
		}
	}
}
