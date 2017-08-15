package com.upa.websites.hackerEarth;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class CmBitShilAndRoundNumbers extends MyScanner {

	static long bit[];
	static long a[];
	static int n;

	public static void main(String args[]) throws Exception {
		CmBitShilAndRoundNumbers in = new CmBitShilAndRoundNumbers();
		n = in.nextInt();
		int q = in.nextInt();
		a = new long[n + 1];
		bit = new long[n + 1];
		Arrays.fill(bit, 0);
		// in.printArray(bit);
		for (int i = 1; i <= n; i++) {
			a[i] = in.nextLong();
			in.update(i, a[i]);
			// in.printArray(bit);
		}
		while (q-- > 0) {
			// System.out.println("New query");
			int t = in.nextInt();
			if (t == 1) {
				int l = in.nextInt();
				int r = in.nextInt();

				// in.printArray(bit);
				// System.out.println("l " + l + " " + r);
				l = l - 1;
				in.ansQuery(l, r);
				// System.out.println(in.query(r) - in.query(l - 1));
			} else {
				int i = in.nextInt();
				long k = in.nextLong();
				// get previous value
				long preValue = a[i];
				// change it with new value
				a[i] = k;
				// make update request
				in.update(i, k, preValue);
				// in.printArray(bit);
			}
		}
	}

	int query(int ind) {
		int ans = 0;
		while (ind > 0) {
			ans += bit[ind];
			ind -= (ind & -ind);
		}
		return ans;
	}

	// extra
	private static void ansQuery(int iOne, int iTwo) {
		// System.out.println(" between " + iOne + " to " + iTwo);
		int count = 0;
		// count till iTwo
		for (; iTwo > 0; iTwo -= iTwo & -iTwo) {
			count += bit[iTwo];
		}
		// System.out.println("Count " + count);
		// Count till iOne and subtract that from count
		int count2 = 0;
		for (; iOne > 0; iOne -= iOne & -iOne) {
			count2 += bit[iOne];
		}
		System.out.println(count - count2);
	}

	private static void update(int index, long val) {
		// if val is round number then
		// increment all the positions of bit
		if (roundNumberCheck(val)) {
			// System.out.println("Round is val " + val);
			for (; index <= n; index += index & -index) {
				bit[index] += 1;
			}
		}
	}

	private static void update(int index, long newVal, long preValue) {
		// if previous value and current value
		// both are roundNumbers then don't change anything
		// or both are not round number then also don't do anything
		boolean isNewRound = roundNumberCheck(newVal);
		boolean isOldRound = roundNumberCheck(preValue);

		// System.out.println(" Old value " + preValue + " is " + isOldRound);
		// System.out.println("New value " + newVal + " is " + isNewRound);
		if (isNewRound == isOldRound) {
			// do nothing
			// System.out.println("Do nothing");
			return;
		}
		// if current value is round number and previous was not
		// then increment
		if (isNewRound && !isOldRound) {
			// System.out.println("Increment ");
			for (; index <= n; index += index & -index) {
				bit[index] += 1;
			}
		}
		// if current value is not round number but
		// previous value was then decrement

		if (!isNewRound && isOldRound) {
			// System.out.println("Decrement ");
			for (; index <= n; index += index & -index) {
				bit[index] -= 1;
			}
		}
		// this plus is stating that we are moving forward
	}

	public static boolean roundNumberCheck(long x) {
		String str = String.valueOf(x);
		int length = str.length();
		if (str.charAt(0) == '-') {
			return false;
		} else {
			if (length == 1) {
				return true;
			}
			if (str.charAt(0) == str.charAt(length - 1)) {
				return true;
			}
			return false;
		}
	}

	private static void printArray(long a[]) {
		System.out.println("Start Print array");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("End Print array");
	}
}
