package com.upa.testing;

import com.upa.templates.MyScanner;

public class CodeVitaComputeSequence extends MyScanner {

	public static void main(String args[]) throws Exception {

		CodeVitaComputeSequence in = new CodeVitaComputeSequence();
		long n = in.nextLong();
		System.out.println(in.solution(n));
	}

	public long solution(long n) {

		long sum = 0;
		for (long i = 0; Math.pow(2, i) <= n; i++) {
			double x = Math.pow(2, i);
			for (long j = 0; j <= n; j++) {
				long y = (long) x + (2 * j);
				sum = (long) (sum + Math.pow(2, y));
			}
		}
		sum = sum % 10;
		return sum;
	}
}
