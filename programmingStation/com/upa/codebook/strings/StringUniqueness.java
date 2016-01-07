package com.upa.codebook.strings;

import java.util.HashMap;

import com.upa.templates.MyScanner;

/*
 * Question Link :
 *
 */
public class StringUniqueness extends MyScanner {

	public static void main(String args[]) throws Exception {
		StringUniqueness in = new StringUniqueness();
		int t = in.nextInt();
		while (t > 0) {
			String str = in.nextToken();
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			boolean flag = true;
			for (int i = 0; i < str.length(); i++) {
				int a = str.charAt(i);
				if (hm.containsKey(a)) {
					flag = false;
					break;
				} else {
					hm.put(a, a);
				}
			}
			if (flag) {
				System.out.println("unique");
			} else {

				System.out.println("nonunique");
			}
			t--;
		}
	}
}
