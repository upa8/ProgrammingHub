package com.upa.websites.hackerrank;

import java.util.Collections;
import java.util.Stack;
import java.util.TreeMap;
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
		// System.out.println(in.lis(a));
		// System.out.println(in.longestSubsequenceWithActualSolution(a));
		System.out.println(in.longestSubsequenceWithFast(a));
	}

	public int longestSubsequenceWithFast(int[] arr) {
		int n = arr.length;
		// key and cnt
		TreeMap<Integer, Integer> tm1 = new TreeMap<Integer, Integer>();
		// cnt and key
		TreeMap<Integer, Integer> tm2 = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int a = arr[i];
			if (tm1.lowerKey(a) == null) {
				if (!tm2.containsKey(1)
						|| (tm2.containsKey(1) && (tm2.get(1) > a))) {
					if (tm2.containsKey(1)) {
						tm1.remove(tm2.get(1));
					}
					tm1.put(a, 1);
					tm2.put(1, a);
				}
			} else {
				int newLen = tm1.get(tm1.lowerKey(a)) + 1;
				if (!tm2.containsKey(newLen)
						|| (tm2.containsKey(newLen) && (tm2.get(newLen) > a))) {
					if (tm2.containsKey(newLen)) {
						tm1.remove(tm2.get(newLen));
					}
					tm1.put(a, newLen);
					tm2.put(newLen, a);
				}
			}
		}
		return tm2.lastKey();
	}

	public int longestSubsequenceWithActualSolution(int arr[]) {
		int T[] = new int[arr.length];
		int actualSolution[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			T[i] = 1;
			actualSolution[i] = i;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					if ((T[j] + 1) > T[i]) {
						T[i] = T[j] + 1;
						// set the actualSolution to point to guy before me
						// Saving the parent
						actualSolution[i] = j;
					}
				}
			}
		}

		// find the index of max number in T
		int maxIndex = 0;
		for (int i = 0; i < T.length; i++) {
			if (T[i] > T[maxIndex]) {
				maxIndex = i;
			}
		}

		// lets print the actual solution
		int t = maxIndex;
		int newT = maxIndex;
		// Now print the solution using
		// parent that we saved in above
		/*
		 * do { t = newT; System.out.print(arr[t] + " "); newT =
		 * actualSolution[t]; } while (t != newT); System.out.println();
		 */
		return T[maxIndex];
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
