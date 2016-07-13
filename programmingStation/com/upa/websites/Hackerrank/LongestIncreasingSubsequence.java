package com.upa.websites.hackerrank;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

import com.upa.templates.MyScanner;

public class LongestIncreasingSubsequence extends MyScanner {

	public static void main(String args[]) throws Exception {
		LongestIncreasingSubsequence in = new LongestIncreasingSubsequence();
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		System.out.println(in.lis(a));
	}

	public static int lis(int A[]) {
		final int MAX_N = 100000;

		int n = A.length;
		int[] L_id = new int[MAX_N], P = new int[MAX_N];
		Vector<Integer> L = new Vector<Integer>();

		int lis = 0, lis_end = 0;
		for (int i = 0; i < n; ++i) {
			int pos = Collections.binarySearch(L, A[i]);
			if (pos < 0) {
				pos = -(pos + 1); // some adjustments are needed
			}
			if (pos >= L.size()) {
				L.add(A[i]);
			} else {
				L.set(pos, A[i]);
			}
			L_id[pos] = i;
			P[i] = pos > 0 ? L_id[pos - 1] : -1;
			if ((pos + 1) > lis) {
				lis = pos + 1;
				lis_end = i;
			}

			// System.out.printf("Considering element A[%d] = %d\n", i, A[i]);
			// System.out.printf("LIS ending at A[%d] is of length %d: ", i,
			// pos + 1);
			reconstruct_print(i, A, P);
			// System.out.println("L is now: " + L);
			// System.out.printf("\n");
		}
		// System.out.println(lis);
		// reconstruct_print(lis_end, A, P);

		return lis;
	}

	static void reconstruct_print(int end, int[] a, int[] p) {
		int x = end;
		Stack<Integer> s = new Stack();
		for (; p[x] >= 0; x = p[x]) {
			s.push(a[x]);
		}
		// System.out.printf("[%d", a[x]);
		for (; !s.isEmpty(); s.pop()) {
			// System.out.printf(", %d", s.peek());
		}
		// System.out.printf("]\n");
	}

}
