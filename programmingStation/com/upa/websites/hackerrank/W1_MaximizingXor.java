package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class W1_MaximizingXor extends MyScanner {

	public static void main(String args[]) throws Exception {

		W1_MaximizingXor in = new W1_MaximizingXor();
		int L = in.nextInt();
		int R = in.nextInt();
		System.out.println(in.solution(L, R));
	}

	private int solution(int l, int r) {
		// TODO Auto-generated method stub
		if (l == r) {
			return 0;
		} else {
			int x = Math.max(l, r);
			int y = Math.min(l, r);
			l = y;
			r = x;
		}
		int max = 0;
		for (int i = l; i <= r; i++) {
			for (int j = i; j <= r; j++) {
				int m = i ^ j;
				if (m > max) {
					max = m;
				}
				// System.out.println("i " + i + "j " + j + " xor: " + m);
			}
		}

		return max;
	}
}
