package Codechef;

import java.util.ArrayList;

public class OracleDevu extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		OracleDevu in = new OracleDevu();
		int t = in.nextInt();
		while ( t > 0 ) {
			int n = in.nextInt();
			if (n == 1) {
				System.out.println(in.nextToken().length());
				t--;
				continue;
			}

			// Create arraylist to store the strings 
			ArrayList<String> str = new ArrayList<String>();
			for ( int i = 0 ; i < n ; i++ ) {
				String s = in.nextToken();
				str.add(s);
			}
			int min = 99999;
			int checkArray[][] = new int[n][n];
			for ( int i = 0 ; i < n ; i++ ) {
				for ( int j = i + 1 ; j < n ; j++ ) {
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
			for ( int i = 0 ; i < n ; i++ ) {
				for ( int j = 0 ; j < n ; j++ ) {
					System.out.print(checkArray[i][j]);
				}
				System.out.println();
			}
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

		for ( int i = 1 ; i < (len1 + 1) ; i++ ) {
			for ( int j = 1 ; j < (len2 + 1) ; j++ ) {
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
