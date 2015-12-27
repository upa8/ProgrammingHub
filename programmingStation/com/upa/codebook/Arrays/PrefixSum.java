package com.upa.codebook.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class PrefixSum {

	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	static int n, q;
	static int[] a;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));

		n = readInt();
		q = readInt();
		a = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			a[i] = readInt() + a[i - 1];
		}

		for (int i = 0; i < q; i++) {
			int l = readInt();
			int r = readInt();
			out.println(a[r] - a[l - 1]);
		}

		out.close();
	}

	static String next() throws IOException {
		while ((st == null) || !st.hasMoreTokens()) {
			st = new StringTokenizer(br.readLine().trim());
		}
		return st.nextToken();
	}

	static long readLong() throws IOException {
		return Long.parseLong(next());
	}

	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}
