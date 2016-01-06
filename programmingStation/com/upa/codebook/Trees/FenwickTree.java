package com.upa.codebook.Trees;

import java.util.Vector;

public class FenwickTree {
	private Vector<Integer> ft;

	private int LSOne(int S) {
		return (S & (-S));
	}

	public FenwickTree() {
	}

	// initialization: n + 1 zeroes, ignore index 0
	public FenwickTree(int n) {
		this.ft = new Vector<Integer>();
		for (int i = 0; i <= n; i++) {
			this.ft.add(0);
		}
	}

	public int rsq(int b) { // returns RSQ(1, b)
		int sum = 0;
		for (; b > 0; b -= this.LSOne(b)) {
			sum += this.ft.get(b);
		}
		return sum;
	}

	public int rsq(int a, int b) { // returns RSQ(a, b)
		return this.rsq(b) - (a == 1 ? 0 : this.rsq(a - 1));
	}

	// adjusts value of the k-th element by v (v can be +ve/inc or -ve/dec)
	void adjust(int k, int v) { // note: n = ft.size() - 1
		for (; k < this.ft.size(); k += this.LSOne(k)) {
			this.ft.set(k, this.ft.get(k) + v);
		}
	}

	public static void main(String[] args) {
		// idx 0 1 2 3 4 5 6 7 8 9 10, no index 0!
		FenwickTree ft = new FenwickTree(10); // ft = {-,0,0,0,0,0,0,0, 0,0,0}
		ft.adjust(2, 1); // ft = {-,0,1,0,1,0,0,0, 1,0,0}, idx 2,4,8 => +1
		ft.adjust(4, 1); // ft = {-,0,1,0,2,0,0,0, 2,0,0}, idx 4,8 => +1
		ft.adjust(5, 2); // ft = {-,0,1,0,2,2,2,0, 4,0,0}, idx 5,6,8 => +2
		ft.adjust(6, 3); // ft = {-,0,1,0,2,2,5,0, 7,0,0}, idx 6,8 => +3
		ft.adjust(7, 2); // ft = {-,0,1,0,2,2,5,2, 9,0,0}, idx 7,8 => +2
		ft.adjust(8, 1); // ft = {-,0,1,0,2,2,5,2,10,0,0}, idx 8 => +1
		ft.adjust(9, 1); // ft = {-,0,1,0,2,2,5,2,10,1,1}, idx 9,10 => +1
		System.out.printf("%d\n", ft.rsq(1, 1)); // 0 => ft[1] = 0
		System.out.printf("%d\n", ft.rsq(1, 2)); // 1 => ft[2] = 1
		System.out.printf("%d\n", ft.rsq(1, 6)); // 7 => ft[6] + ft[4] = 5 + 2 =
													// 7
		System.out.printf("%d\n", ft.rsq(1, 10)); // 11 => ft[10] + ft[8] = 1 +
													// 10 = 11
		System.out.printf("%d\n", ft.rsq(3, 6)); // 6 => rsq(1, 6) - rsq(1, 2) =
													// 7 - 1

		ft.adjust(5, 2); // update demo
		System.out.printf("%d\n", ft.rsq(1, 10)); // now 13
	}
}