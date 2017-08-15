package com.upa.websites.hackerrank;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import com.upa.templates.MyScanner;

public class Day10 extends MyScanner {

	public static void main(String args[]) throws Exception {
		// Day10 in = new Day10();
		Scanner in = new Scanner(System.in);
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(System.out));

		int t = in.nextInt();
		while (t > 0) {
			long n = in.nextLong();
			String s = new String();
			while (n > 0) {
				s = modulo(n, 2) + "" + s;
				n = n >> 1;
			}
			out.write(s + "\n");
			out.flush();
			t--;
		}
	}

	private static long modulo(long S, long N) {
		return ((S) & (N - 1));
	}
}
