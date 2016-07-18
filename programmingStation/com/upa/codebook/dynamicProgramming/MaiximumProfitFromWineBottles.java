package com.upa.codebook.dynamicProgramming;
/*
 * Problem
 * Imagine you have a collection of N wines placed next to each other on a
 * shelf. For simplicity, let's number the wines from left to right as
 * they are standing on the shelf with integers from 1 to N, respectively.
 *  The price of the ith wine is pi. (prices of different wines can be
 *  different).Because the wines get better every year, supposing today
 *  is the year 1, on year y the price of the ith wine will be y*pi,
 *  i.e. y-times the value that current year. You want to sell all
 *  the wines you have, but you want to sell exactly one wine per year,
 *  starting on this year. One more constraint - on each year you are
 *  allowed to sell only either the leftmost or the rightmost wine on
 *  the shelf and you are not allowed to reorder the wines on the shelf
 *  (i.e. they must stay in the same order as they are in the beginning).
 *  You want to find out, what is the maximum profit you can get, if you
 *  sell the wines in optimal order?
 *
 */

public class MaiximumProfitFromWineBottles {
	int N = 100; // read-only number of wines in the beginning
	int p[] = new int[this.N]; // read-only array of wine prices
	int cache[][] = new int[this.N][this.N]; // all values initialized to -1 (or
												// anything you choose)

	// without memoization
	/*
	 * int profit(int be, int en) { if (be > en) { return 0; } // (en-be+1) is
	 * the number of unsold wines int year = (this.N - ((en - be) + 1)) + 1; //
	 * as in the description // above return Math.max(this.profit(be + 1, en) +
	 * (year * this.p[be]), this.profit(be, en - 1) + (year * this.p[en])); }
	 */

	int profit(int be, int en) {
		if (be > en) {
			return 0;
		}
		// these two lines save the day
		if (this.cache[be][en] != -1) {
			return this.cache[be][en];
		}
		int year = (this.N - ((en - be) + 1)) + 1;
		// when calculating the new answer, don't forget to cache it
		return this.cache[be][en] = Math.max(
				this.profit(be + 1, en) + (year * this.p[be]),
				this.profit(be, en - 1) + (year * this.p[en]));
	}

}
