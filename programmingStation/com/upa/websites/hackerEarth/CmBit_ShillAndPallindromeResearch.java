package com.upa.websites.hackerEarth;

import com.upa.templates.MyScanner;

public class CmBit_ShillAndPallindromeResearch extends MyScanner {
	private static int n;
	private static int[][] bit;

	public static void main(String[] args) throws Exception {
		CmBit_ShillAndPallindromeResearch in = new CmBit_ShillAndPallindromeResearch();
		n = in.nextInt();
		int q = in.nextInt();
		String str1 = in.nextToken();
		StringBuilder str = new StringBuilder(str1);
		bit = new int[n + 1][26];
		for (int i = 1; i <= n; i++) {
			in.update(i, str.charAt(i - 1));
		}
		while (q-- > 0) {
			int type = in.nextInt();
			int index = in.nextInt();
			if (type == 1) {
				char c = in.nextChar();
				in.update(index, c, str.charAt(index - 1));
				str.setCharAt(index - 1, c);
			} else {
				int x = in.nextInt();
				in.ansQuery(index - 1, x);
			}
		}
	}

	private static void ansQuery(int iOne, int iTwo) {
		int[] chars = new int[26];
		int odds = 0;
		// find all the character till two
		for (; iTwo > 0; iTwo -= iTwo & -iTwo) {
			for (int i = 0; i < 26; i++) {
				chars[i] += bit[iTwo][i];
			}
		}
		// subtract characters till 1
		for (; iOne > 0; iOne -= iOne & -iOne) {
			for (int i = 0; i < 26; i++) {
				chars[i] -= bit[iOne][i];
			}
		}
		// check whether any character has odd occurence
		for (int i = 0; i < 26; i++) {
			if ((chars[i] % 2) == 1) {
				odds++;
			}
		}
		System.out.println((odds > 1) ? "no" : "yes");
	}

	private static void update(int index, char ch) {
		for (; index <= n; index += index & -index) {
			bit[index][ch - 'a']++;
		}
	}

	private static void update(int index, int ch, int prevCh) {
		for (; index <= n; index += index & -index) {
			bit[index][ch - 'a']++;
			bit[index][prevCh - 'a']--;
		}
	}

}
