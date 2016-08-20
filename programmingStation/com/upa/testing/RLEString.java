package com.upa.testing;

import java.util.StringTokenizer;

import com.upa.templates.MyScanner;

public class RLEString extends MyScanner {

	static StringTokenizer st;

	public static void main(String args[]) throws Exception {
		RLEString in = new RLEString();
		String readLine = in.readLine();
		st = new StringTokenizer(readLine);
		while (st.hasMoreElements()) {
			String str = st.nextToken();
			int length = str.length();
			int oddEven = 0;
			StringBuilder ans = new StringBuilder();
			for (int i = 0; i < length; i++) {
				int x = str.charAt(i) - 64;
				for (int j = 0; j < x; j++) {
					if ((oddEven % 2) == 0) {
						ans.append("0");
					} else {
						ans.append("!");
					}
				}
				oddEven++;
			}
			System.out.println(ans.toString());
		}
	}
}
