package com.upa.websites.hackerEarth;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.upa.templates.MyScanner;

public class MonkAndTaskSol1 extends MyScanner {

	public static void main(String args[]) throws Exception {

		MonkAndTaskSol1 in = new MonkAndTaskSol1();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			HashMap<Integer, List<String>> hm = new HashMap<Integer, List<String>>();
			int maxCount = 0;
			for (int i = 0; i < n; i++) {
				String str = in.nextToken();
				BigInteger val = new BigInteger(str);
				int count = val.bitCount();
				if (maxCount < count) {
					maxCount = count;
				}

				if (hm.containsKey(count)) {
					List<String> currentList = hm.get(count);
					currentList.add(str);
					hm.put(count, currentList);
				} else {
					List<String> createList = new ArrayList<>();
					createList.add(str);
					hm.put(count, createList);
				}

			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j <= maxCount; j++) {
				List<String> currentList = hm.get(j);
				if (currentList != null) {
					for (String s : currentList) {
						sb.append(s);
						sb.append(" ");
					}
				}
			}
			System.out.println(sb.toString());
		}
	}
}
