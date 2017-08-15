package com.upa.websites.hackerEarth;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class MonkInTheLandOfPokemons extends MyScanner {

	public static void main(String args[]) throws Exception {

		MonkInTheLandOfPokemons in = new MonkInTheLandOfPokemons();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			int count = 0;
			for (int i = 0; i < n; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				if (a == b) {
					continue;
				} else {
					if (hm.containsKey(b)) {
						if (hm.containsKey(a)) {
							int currentCount = hm.get(a);
							currentCount += 1;
							hm.put(a, currentCount);
						} else {
							hm.put(a, 1);
						}
						int currentCountB = hm.get(b);
						if (currentCountB == 0) {
							count++;
						} else {
							currentCountB -= 1;
							hm.put(b, currentCountB);
						}

						continue;
					} else {
						count++;
						if (hm.containsKey(a)) {
							int currentCount = hm.get(a);
							currentCount += 1;
							hm.put(a, currentCount);
						} else {
							hm.put(a, 1);
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
