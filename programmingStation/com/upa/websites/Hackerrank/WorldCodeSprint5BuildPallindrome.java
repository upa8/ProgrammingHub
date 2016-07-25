package com.upa.websites.hackerrank;

import java.util.Iterator;
import java.util.TreeSet;

import com.upa.templates.MyScanner;

public class WorldCodeSprint5BuildPallindrome extends MyScanner {

	public static void main(String args[]) throws Exception {
		WorldCodeSprint5BuildPallindrome in = new WorldCodeSprint5BuildPallindrome();
		int q = in.nextInt();
		while (q-- > 0) {
			String a = in.nextToken();
			String b = in.nextToken();
			StringBuilder strReverse = new StringBuilder(b);
			b = strReverse.reverse().toString();
			// System.out.println(in.Solution(a.toCharArray(),
			// b.toCharArray()));
			// System.out.println("Reverse " + b);
			// System.out.println("New Test ");
			System.out.println(in.longestCommonSubstring(a.toCharArray(),
					b.toCharArray()));

		}
	}

	public String longestCommonSubstring(char str1[], char str2[]) {

		int str1Length = str1.length;
		int str2Length = str2.length;
		// System.out.println("Str1Length " + str1Length);
		// System.out.println("Str2Length " + str2Length);
		int T[][] = new int[str1Length + 1][str2Length + 1];
		int max = 0;
		int x = 0;
		int y = 0;
		for (int i = 1; i <= str1Length; i++) {
			for (int j = 1; j <= str2Length; j++) {
				// check if they are equal or not
				if (str1[i - 1] == str2[j - 1]) {
					// if equal then get value
					// of diagonal element
					T[i][j] = T[i - 1][j - 1] + 1;
					if (max < T[i][j]) {
						max = T[i][j];
						x = i;
						y = j;
					}
				}
			}
		}

		if (max == 0) {
			return "-1";
		}
		// System.out.println("Max " + max);

		// now instead of returning max
		// get the max string
		// now select all the string which has
		// maximum value .
		TreeSet<String> set = new TreeSet<String>();
		for (int i = 1; i < (str1Length + 1); i++) {
			for (int j = 1; j < (str2Length + 1); j++) {

				if (T[i][j] == max) {
					// System.out.println("Found max at i = " + i + " j =" + j);
					// check this string
					StringBuilder str = new StringBuilder();
					for (int m = 0; m < max; m++) {
						str.append(str1[i - 1 - m]);
					}
					// System.out.println("String before max " +
					// str.toString());
					if (i <= (str1Length - 1)) {
						// System.out.println("add next character of str1");
						// System.out.println("String is " + str.toString());
						String normal = str.toString();
						String reverseString = str.reverse().toString();
						StringBuilder newString = new StringBuilder(
								reverseString);
						// System.out.println(
						// "new String is " + newString.toString());
						newString.append((str1[i]));
						// System.out.println(
						// "ADD next char " + newString.toString());
						// System.out.println("String is " + str.toString());
						newString.append(normal);
						// System.out.println("String is " + str.toString());
						// System.out.println(
						// "Complete string " + newString.toString());
						set.add(newString.toString());
					}
					if ((j) <= (str2Length - 1)) {
						// System.out.println("add previous character of str2");
						String normal = str.toString();

						String reverseString = str.reverse().toString();
						StringBuilder newString = new StringBuilder(
								reverseString);
						// System.out.println(
						// "new String is " + newString.toString());
						newString.append(str2[j]);
						// System.out.println(
						// "ADD prev char " + newString.toString());
						newString.append(normal);
						// System.out.println(
						// "Complete string " + newString.toString());
						set.add(newString.toString());
					}
					// compulsory
					// System.out.println("If the character is not present ");
					String normal = str.toString();
					String reverseString = str.reverse().toString();
					StringBuilder newString = new StringBuilder(reverseString);
					// System.out.println("New string " + newString.toString());
					newString.append(normal);
					// System.out.println(
					// "New complete Sting " + newString.toString());
					set.add(newString.toString());

				}
			}
		}

		// now get the string from set
		// which has maximum length and
		// also has maximum length
		Iterator<String> iterator;
		iterator = set.iterator();
		// displaying the Tree set data
		int maxLengthOfString = 0;
		while (iterator.hasNext()) {
			String testString = iterator.next();
			int stringLength = testString.length();
			if (maxLengthOfString <= stringLength) {
				maxLengthOfString = stringLength;
			}
		}
		TreeSet<String> tm = new TreeSet<String>();
		Iterator<String> it;
		it = set.iterator();
		while (it.hasNext()) {
			String testString = it.next();
			int l = testString.length();
			if (l == maxLengthOfString) {
				tm.add(testString);
			}
		}
		String ans = tm.first();
		// System.out.println("Final answer is " + ans.toString());
		return ans;
	}

	public String Solution(String a, String b) {
		String ans = "-1";

		for (int i = 0; i < a.length(); i++) {
			// select first character
			// find first occurrence of
			// that character
			for (int j = 0; j < b.length(); j++) {
				// if both character are same
				if (a.charAt(i) == b.charAt(j)) {
					// now check the pallindrome
					this.pallindromeCheck(a, b, i, j);
				}
			}
		}
		return ans;
	}

	private void pallindromeCheck(String a, String b, int i, int j) {
		// TODO Auto-generated method stub
		// Check the longest pallindrome
		int aMax = a.length();
		int bMin = 0;
		// now go forward in a and backward in b

	}
}
