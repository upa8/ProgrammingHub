package com.upa.websites.UvaOnlineJudge;

import com.upa.templates.MyScanner;

public class ThreeNplusOne extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreeNplusOne in = new ThreeNplusOne();
		long a = in.nextLong();
		long b = in.nextLong();
		long start = a;
		long count = 0;
		do {
			System.out.println(start);
			count++;
			if ((start % 2) == 0) {
				start = start / 2;
			} else {
				start = (start * 3) + 1;
			}
			if (b == start) {
				count++;
				break;
			}
		} while (start != 1);
		System.out.println(a + " " + b + " " + count);
	}
}
