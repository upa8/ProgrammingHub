package com.upa.websites.leetCode;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class P387UniqueCharacter extends MyScanner {

	public static void main(String args[]) throws Exception {
		P387UniqueCharacter in = new P387UniqueCharacter();
		String s = in.nextToken();
		System.out.println(in.firstUniqChar(s));
	}

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		int l = s.length();
		for (int i = 0; i < l; i++) {
			char m = s.charAt(i);
			if (hm.containsKey(m)) {
				int x = hm.get(m);
				hm.put(m, x + 1);
			} else {
				hm.put(m, 0);
			}
		}

		for (int i = 0; i < l; i++) {
			char m = s.charAt(i);
			if (hm.get(m) == 0) {
				return i;
			}
		}
		return -1;
	}

}
