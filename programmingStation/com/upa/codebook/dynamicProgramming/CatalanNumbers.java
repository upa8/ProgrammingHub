package com.upa.codebook.dynamicProgramming;
/*
 * Catalan Numbers :
 * 		Number of possible binary search tree of a tree with n node nodes.
 *
 */

public class CatalanNumbers {
	static int[] Table;

	public static void main(String args[]) {
		CatalanNumbers in = new CatalanNumbers();
		// For recursive calls
		Table = new int[3];
		System.out.println(in.CatalanNumber(3));
		// For non recursive calls
		Table = new int[4];
		System.out.println(in.CatalanNumberWithDp(3));
	}

	// recursive solution
	public int CatalanNumber(int n) {
		if (n == 0) {
			return 1;
		}
		int count = 0;
		for (int i = 1; i <= n; i++) {

			count += this.CatalanNumber(i - 1) * this.CatalanNumber(n - i);
			// System.out.println(" i " + count);
		}
		return count;
	}

	public int CatalanNumberWithDp(int n) {
		if (Table[n] != 0) {
			return Table[n];
		}
		Table[n] = 0;
		for (int i = 1; i <= n; i++) {
			Table[n] += this.CatalanNumber(i - 1) * this.CatalanNumber(n - i);
		}
		return Table[n];
	}
}
