package com.upa.websites.hackerEarth;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class MonkAndMatchMaking extends MyScanner {

	public static void main(String args[]) throws Exception {
		MonkAndMatchMaking in = new MonkAndMatchMaking();
		String str = in.nextToken();
		int q = in.nextInt();
		while (q-- > 0) {
			// System.out.println("querry" + q);
			int l1 = in.nextInt();
			int r1 = in.nextInt();
			int l2 = in.nextInt();
			int r2 = in.nextInt();
			int diffFirst = r1 - l1;
			// System.out.println("First diff" + diffFirst);
			int diffSecond = r2 - l2;
			// System.out.println("Second diff" + diffSecond);
			if (diffFirst == diffSecond) {
				String firstSub = str.substring(l1 - 1, r1);
				// System.out.println(firstSub);
				String secondSub = str.substring(l2 - 1, r2);
				// System.out.println(secondSub);
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put(firstSub, firstSub);
				// hm.containsKey(secondSub);
				// if (firstSub.equals(secondSub)) {
				if (hm.containsKey(secondSub)) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			} else {
				System.out.println("No");
			}
		}
	}
}
