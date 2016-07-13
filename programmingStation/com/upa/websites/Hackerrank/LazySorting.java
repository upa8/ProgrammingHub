package com.upa.websites.hackerrank;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class LazySorting extends MyScanner {

	private static final int maxSizeOfPermutation = 18;
	private static long[] factorial = factorials();

	public static void main(String args[]) throws Exception {
		LazySorting in = new LazySorting();
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = a[i];
		}
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			System.out.println("1.000000");
		} else {
			// System.out.println(in.solution(a));
			// System.out.println(in.permute(a));

		}
	}

	private String solution(int[] a) {
		// TODO Auto-generated method stub
		double answer = doSolve(a);
		return String.format("%.6f", answer);
	}

	private static long[] factorials() {
		long[] factorial = new long[maxSizeOfPermutation + 1];
		factorial[0] = factorial[1] = 1;
		for (int i = 2; i < factorial.length; i++) {
			factorial[i] = (factorial[i - 1] * i);
		}
		return factorial;
	}

	private static double doSolve(int[] seq) {
		return numOfPerms(seq);
	}

	private static double numOfPerms(int[] seq) {
		// Map<Integer, Long> freq =
		// Arrays.stream(seq).boxed().collect(Collectors
		// .groupingBy(Function.identity(), Collectors.counting()));
		double numOfPerms = factorial(seq.length);
		// for (long uniqElemFreq : freq.values()) {
		// numOfPerms /= factorial((int) uniqElemFreq);
		// }
		return numOfPerms;
	}

	private static long factorial(int n) {
		return factorial[n];
	}
}