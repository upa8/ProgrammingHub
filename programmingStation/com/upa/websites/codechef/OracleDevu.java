package com.upa.websites.codechef;

/*	Question : https://www.codechef.com/problems/ORACLCS
 * 	Editorials : https://discuss.codechef.com/questions/77617/oraclcs-editorial
 *
 * 	Solutions :
 *
 * 	Solution 1:
 *
 * 	Solution 2 :
 * 		We need to find the least common subsequence of n strings . String
 * 		consist of a and b only . Count number a and number of b in a
 * 		string , then find minimum of this a's and b's . This minimum can be
 * 		LCS of that string. Find minimum of all n string , and output that
 * 		minimum . It will be the LCS of all the strings .
 *
 * 		The smallest LCS is always a constant string,
 * 		i.e. either aaa...a or bbb...b. Thus the answer is the minimum
 * 		number of as or bs in any string.
 *
 * 		Additional Question :
 *		 Does the above algorithm still work if the alphabet were
 *		 larger than {a,b}?
 *
 *
 */
import java.util.ArrayList;

public class OracleDevu extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OracleDevu in = new OracleDevu();
		int t = in.nextInt();
		in.solution2(t, in);
		// in.solution1(t, in); // Solution1 approach is wrong
	}

	private void solution2(int t, OracleDevu in) throws Exception {
		while (t > 0) {
			int n = in.nextInt();
			int min_ka = 100000;
			int min_kb = 100000;
			for (int i = 0; i < n; i++) {
				String s = in.nextToken();
				int ka = 0, kb = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) == 'a') {
						++ka;
					} else {
						++kb;
					}
				}
				min_ka = Math.min(min_ka, ka);
				min_kb = Math.min(min_kb, kb);
			}
			System.out.println(Math.min(min_ka, min_kb));
			t--;
		}

	}

	private void solution1(int t, OracleDevu in) throws Exception {
		// TODO Auto-generated method stub

		while (t > 0) {
			int n = in.nextInt();
			if (n == 1) {
				System.out.println(in.nextToken().length());
				t--;
				continue;
			}

			// Create arraylist to store the strings
			ArrayList<String> str = new ArrayList<String>();
			for (int i = 0; i < n; i++) {
				String s = in.nextToken();
				str.add(s);
			}
			int min = 99999;
			int checkArray[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					String a = str.get(i);
					String b = str.get(j);
					String c = in.findLongestSubString(a, b);

					int cLength = c.length();
					if (cLength <= min) {
						min = cLength;
					}
					checkArray[i][j] = cLength;

				}
			}
			/*
			 * for ( int i = 0 ; i < n ; i++ ) { for ( int j = 0 ; j < n ; j++ )
			 * { System.out.print(checkArray[i][j]); } System.out.println(); }
			 */
			System.out.println(min);
			t--;
		}

	}

	private String findLongestSubString(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int arr[][] = new int[len1 + 1][len2 + 1];
		int largest = 0;
		int largestI = 0;

		for (int i = 1; i < (len1 + 1); i++) {
			for (int j = 1; j < (len2 + 1); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					if (arr[i][j] > largest) {
						largest = arr[i][j];
						largestI = i - 1;
					}
				}
			}
		}
		return s1.substring(largestI - (largest - 1), largestI + 1);
	}
}
