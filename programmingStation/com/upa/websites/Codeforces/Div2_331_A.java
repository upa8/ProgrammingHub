package com.upa.websites.Codeforces;

import java.util.HashSet;
import java.util.Iterator;

import com.upa.templates.MyScanner;

/*
 * Question : http://codeforces.com/contest/596/problem/A
 * Type : Ad-Hoc . Mathematics .
 *
 */

public class Div2_331_A extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Div2_331_A in = new Div2_331_A();
		int n = in.nextInt();
		if (n == 1) {
			// Get this input only for formality
			int x = in.nextInt();
			int y = in.nextInt();
			System.out.println("-1");
		} else {
			HashSet<Integer> H_X = new HashSet<Integer>();
			HashSet<Integer> H_Y = new HashSet<Integer>();
			while (n > 0) {
				int x = in.nextInt();
				int y = in.nextInt();
				H_X.add(x);
				H_Y.add(y);
				n--;
			}
			if ((H_X.size() != 2) || (H_Y.size() != 2)) {
				System.out.println("-1");
			} else {
				int ans = in.calculateArea(H_X, H_Y);
				System.out.println(ans);
			}
		}
	}

	private int calculateArea(HashSet<Integer> h_X, HashSet<Integer> h_Y) {
		// TODO Auto-generated method stub
		Iterator<Integer> I_X = h_X.iterator();
		Iterator<Integer> I_Y = h_Y.iterator();
		int d_x = 0, d_y = 0;
		while (I_X.hasNext()) {
			d_x = Math.abs(I_X.next() - I_X.next());
		}
		while (I_Y.hasNext()) {
			d_y = Math.abs(I_Y.next() - I_Y.next());
		}
		return (d_x * d_y);

	}

}
