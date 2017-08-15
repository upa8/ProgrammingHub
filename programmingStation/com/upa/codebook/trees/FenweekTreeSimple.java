package com.upa.codebook.trees;

import com.upa.templates.MyScanner;

public class FenweekTreeSimple extends MyScanner {
	static int dataArray[];
	static int fenweekArray[];
	static int n;

	public static void main(String args[]) throws Exception {
		FenweekTreeSimple in = new FenweekTreeSimple();
		// number of elements
		n = in.nextInt();
		dataArray = new int[n];
		fenweekArray = new int[n];
		for (int i = 0; i < n; i++) {
			dataArray[i] = in.nextInt();
			// make update operation here
			in.update(i, dataArray[i]);
		}
		System.out.println(in.query(6));
		System.out.println(in.query(0));
		System.out.println(in.query(1));
		System.out.println(in.query(2));
		System.out.println(in.query(3));
		// sum between 2 and 7
		System.out.println(in.query(6) - in.query(2 - 1));
		System.out.println(in.query(6) - in.query(2));
	}

	public void update(int i, int val) {
		for (; val < n; val += val & -val) {
			fenweekArray[val] += val;
		}
	}

	public int query(int x) {
		int sum = 0;
		for (; x > 0; x -= x & -x) {
			sum += fenweekArray[x];
		}
		return sum;
	}
}
