package com.upa.websites.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MonkAndMatchMaking2 {
	private static String s;
	private static long pow1[];
	private static long pow2[];
	private static long hash1[];
	private static long hash2[];
	private static final long PRIME1 = 41;
	private static final long PRIME2 = 47;
	private static final long MOD1 = 10000009;
	private static final long MOD2 = 10000007;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		s = br.readLine();
		int Q = Integer.parseInt(br.readLine());
		pow1 = new long[100502];
		pow2 = new long[100502];
		hash1 = new long[100502];
		hash2 = new long[100502];
		prec();
		while (Q-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken(" "));
			int y1 = Integer.parseInt(st.nextToken(" "));
			int x2 = Integer.parseInt(st.nextToken(" "));
			int y2 = Integer.parseInt(st.nextToken(" "));
			if ((y1 - x1) == (y2 - x2)) {
				long H11 = getHash1(x1, y1);
				long H12 = getHash2(x1, y1);
				long H21 = getHash1(x2, y2);
				long H22 = getHash2(x2, y2);
				if ((H11 == H21) && (H12 == H22)) {
					sb.append("Yes\n");
				} else {
					sb.append("No\n");
				}
			} else {
				sb.append("No\n");
			}
		}
		System.out.print(sb);
	}

	public static void prec() {
		pow1[0] = pow2[0] = 1;
		for (int i = 1; i <= s.length(); ++i) {
			pow1[i] = (pow1[i - 1] * PRIME1) % MOD1;
			pow2[i] = (pow2[i - 1] * PRIME2) % MOD2;
		}
		for (int i = 1; i <= s.length(); ++i) {
			hash1[i] = ((((hash1[i - 1] * PRIME1) + s.charAt(i - 1)) - 'a') + 1)
					% MOD1;
			hash2[i] = ((((hash2[i - 1] * PRIME2) + s.charAt(i - 1)) - 'a') + 1)
					% MOD2;
		}
	}

	public static long getHash1(int l, int r) {
		int len = (r - l) + 1;
		return ((hash1[r] - ((hash1[l - 1] * pow1[len]) % MOD1)) + MOD1) % MOD1;
	}

	public static long getHash2(int l, int r) {
		int len = (r - l) + 1;
		return ((hash2[r] - ((hash2[l - 1] * pow2[len]) % MOD2)) + MOD2) % MOD2;
	}
}