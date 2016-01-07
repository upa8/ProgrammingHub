package com.upa.websites.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prom_Night {
	public static void main(String[] args) throws Exception {
		solve s = new solve();
		s.sol();
	}
}

class solve {

	public void sol() throws Exception {
		ModScanner in = new ModScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int t = in.nextInt();
		for (int tc = 0; tc < t; tc++) {
			int males = in.nextInt();
			int females = in.nextInt();
			int marr[] = new int[males];
			int farr[] = new int[females];
			for (int i = 0; i < males; i++) {
				marr[i] = in.nextInt();
			}
			for (int i = 0; i < females; i++) {
				farr[i] = in.nextInt();
			}
			if (females < males) {
				pw.println("NO");
			} else {
				Arrays.sort(marr);
				Arrays.sort(farr);
				int fl = -1;
				for (int i = 0, j = 0; (i < males) && (j < females); i++, j++) {
					if (marr[i] <= farr[j]) {
						fl = 0;
						break;
					}
				}
				if (fl == 0) {
					pw.println("NO");
				} else {
					pw.println("YES");
				}
			}
		}
		pw.flush();
	}
}

class ModScanner {
	BufferedReader br;
	StringTokenizer st;

	public ModScanner() {
		this.br = new BufferedReader(new InputStreamReader(System.in));
	}

	String nextToken() throws Exception {

		while ((this.st == null) || !this.st.hasMoreElements()) {
			this.st = new StringTokenizer(this.br.readLine());

		}
		return this.st.nextToken();
	}

	int nextInt() throws Exception, Exception {
		return Integer.parseInt(this.nextToken());
	}

	long nextLong() throws Exception {
		return Long.parseLong(this.nextToken());
	}

	double nextDouble() throws Exception {
		return Double.parseDouble(this.nextToken());
	}
}