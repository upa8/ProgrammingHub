package com.upa.websites.hackerrank;

import java.util.Map.Entry;
import java.util.TreeMap;

import com.upa.templates.MyScanner;

public class MissingNumbers extends MyScanner {

	public static void main(String args[]) throws Exception {
		MissingNumbers in = new MissingNumbers();
		int n = in.nextInt();
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (tm.containsKey(x)) {
				int y = tm.get(x);
				tm.put(x, y + 1);
			} else {
				tm.put(x, 1);
			}
		}
		int m = in.nextInt();
		TreeMap<Integer, Integer> tm2 = new TreeMap<Integer, Integer>();
		for (int i = 0; i < m; i++) {
			int x = in.nextInt();
			if (tm2.containsKey(x)) {
				int y = tm2.get(x);
				tm2.put(x, y + 1);
			} else {
				tm2.put(x, 1);
			}
		}

		if (m > n) {
			for (Entry<Integer, Integer> entry : tm2.entrySet()) {
				int x = entry.getKey();
				int y = entry.getValue();
				if (tm.containsKey(x)) {
					int p = tm.get(x);
					if (Math.abs(p - y) != 0) {
						System.out.print(x + " ");
					}
				} else {
					System.out.print(x + " ");
				}
			}

		} else {
			for (Entry<Integer, Integer> entry : tm.entrySet()) {
				int x = entry.getKey();
				int y = entry.getValue();
				if (tm2.containsKey(x)) {
					int p = tm2.get(x);
					if (Math.abs(p - y) != 0) {
						System.out.print(x + " ");
					}
				} else {
					System.out.print(x + " ");
				}
			}
		}
	}
}
