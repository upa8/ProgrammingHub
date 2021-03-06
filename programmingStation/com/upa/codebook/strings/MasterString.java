package com.upa.codebook.strings;

import java.util.ArrayList;

public class MasterString {

	public MasterString() {

	}

	/*
	 * Time complexity : o(n)
	 */
	public String naiveStringMatching(String parentString, String checkString) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < parentString.length(); i++) {
			boolean found = true;
			for (int j = 0; (j < checkString.length()) && found; j++) {
				if (parentString.charAt(i + j) != checkString.charAt(j)) {
					found = false;
				}

			}
			if (found) {
				System.out.println("String found at : " + i);
				str.append(i + " ");
			}
		}
		return str.toString();
	}

	/**
	 * Slow method of pattern matching
	 */
	public boolean hasSubstring(char[] text, char[] pattern) {
		int i = 0;
		int j = 0;
		int k = 0;
		while ((i < text.length) && (j < pattern.length)) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {
				j = 0;
				k++;
				i = k;
			}
		}
		if (j == pattern.length) {
			return true;
		}
		return false;
	}

	/**
	 * Compute temporary array to maintain size of suffix which is same as
	 * prefix Time/space complexity is O(size of pattern)
	 */
	private int[] computeTemporaryArray(char pattern[]) {
		int[] lps = new int[pattern.length];
		int index = 0;
		for (int i = 1; i < pattern.length;) {
			if (pattern[i] == pattern[index]) {
				lps[i] = index + 1;
				index++;
				i++;
			} else {
				if (index != 0) {
					index = lps[index - 1];
				} else {
					lps[i] = 0;
					i++;
				}
			}
		}
		return lps;
	}

	/**
	 * KMP algorithm of pattern matching.
	 */
	public ArrayList<Integer> KMP(char[] text, char[] pattern) {

		int lps[] = this.computeTemporaryArray(pattern);
		ArrayList<Integer> indexOfMatch = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while ((i < text.length) && (j < pattern.length)) {
			if (text[i] == pattern[j]) {
				i++;
				j++;
			} else {
				if (j != 0) {
					j = lps[j - 1];
				} else {
					i++;
				}
			}
			if (j == pattern.length) {

				// System.out.println(i - j);
				indexOfMatch.add(i - j);
				j = 0;
				i = (i - j) + 1;
			}
		}
		// if (j == pattern.length) {
		// return true;
		// }return false;
		return indexOfMatch;
	}

	public static void main(String[] args) {

		MasterString stringChecker = new MasterString();
		// stringChecker.naiveStringMatching("abc b", "b");
		String str = "abcxabcdabcdabcyabcxabcdabcdabcy";
		String subString = "abcdabcy";
		// boolean result = stringChecker.KMP(str.toCharArray(),
		// subString.toCharArray());
		// System.out.print(result);
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = stringChecker.KMP(str.toCharArray(), subString.toCharArray());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
