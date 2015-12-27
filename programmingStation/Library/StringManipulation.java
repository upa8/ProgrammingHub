package Library;

import java.util.Arrays;

public class StringManipulation {

	StringManipulation() {

	}

	// From : CrackCode.pdf 
	// Question : 1.4  Write a method to decide if two strings are anagrams or not
	// LeetCode: https://leetcode.com/problems/valid-anagram/

	public boolean isAnagram(String a, String b) {
		int lengthOfA = a.length();
		int lengthOfB = b.length();
		if (lengthOfA != lengthOfB) {
			return false;
		}
		//		int noOfUniqueCharacters = 0;
		//		int noOfLetters = 0;
		int uniqueArray[] = new int[256];
		Arrays.fill(uniqueArray, 0);
		for ( int i = 0 ; i < lengthOfA ; i++ ) {
			uniqueArray[a.charAt(i)] += 1;
		}

		//	System.out.println(noOfLetters);
		//	System.out.println(noOfUniqueCharacters);
		//	for ( int i = 0 ; i < lengthOfB ; i++ ) {
		//		uniqueArray[b.charAt(i)] -= 1;
		//	}
		//	System.out.println(noOfLetters);
		//	System.out.println(noOfUniqueCharacters);
		for ( int i = 0 ; i < 256 ; i++ ) {
			if (uniqueArray[i] == 0) {
				continue;
			} else {
				return false;
			}
		}
		return true;

		/*
		 * public static boolean anagram(String s, String t) {
		    if (s.length() != t.length()) return false;
		    int[] letters = new int[256];
		    int num_unique_chars = 0;
		    int num_completed_t = 0;
		    char[] s_array = s.toCharArray();
		    for (char c : s_array) { // count number of each char in s.
		    if (letters[c] == 0) ++num_unique_chars;
		    ++letters[c];
		   }
		   for (int i = 0; i < t.length(); ++i) {
		   int c = (int) t.charAt(i);
		   if (letters[c] == 0) { // Found more of char c in t than in s.
		    return false;
		   }
		   --letters[c];
		   if (letters[c] == 0) {
		    ++num_completed_t;
		    if (num_completed_t == num_unique_chars) {
		     // it’s a match if t has been processed completely
		     return i == t.length() - 1;
		    }
		   }
		   }
		   return false;
		 }
		 */
	}

	// Question : CrackCode.pdf
	//1.5  Write a method to replace all spaces in a string with ‘%20’

	public static void ReplaceFun(char[] str, int length) {
		int spaceCount = 0, newLength, i = 0;
		for ( i = 0 ; i < length ; i++ ) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		newLength = length + (spaceCount * 2);
		str[newLength] = '\0';
		for ( i = length - 1 ; i >= 0 ; i-- ) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
	}
}
