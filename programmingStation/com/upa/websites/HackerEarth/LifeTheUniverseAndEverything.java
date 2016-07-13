package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class LifeTheUniverseAndEverything extends MyScanner {

	public static void main(String args[]) throws Exception {
		LifeTheUniverseAndEverything in = new LifeTheUniverseAndEverything();
		while (true) {
			int x = in.nextInt();
			if (x == 42) {
				break;
			} else {
				System.out.println(x);
			}
		}
	}

}
