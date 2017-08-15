package com.upa.websites.hackerEarth;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class CmSearchDiscoverMonk extends MyScanner {
	public static void main(String args[]) throws Exception {
		CmSearchDiscoverMonk in = new CmSearchDiscoverMonk();
		int n = in.nextInt();
		int q = in.nextInt();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			hm.put(x, x);
		}
		for (int i = 0; i < q; i++) {
			int x = in.nextInt();
			if (hm.containsKey(x)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
