package com.upa.websites.hackerEarth;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class MonkAndCollision extends MyScanner {

	public static void main(String args[]) throws Exception {
		MonkAndCollision in = new MonkAndCollision();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int countCollisions = 0;
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				x = x % 10;
				if (hm.containsKey(x)) {
					countCollisions++;
				} else {
					hm.put(x, x);
				}
			}
			System.out.println(countCollisions);
			t--;
		}
	}
}
