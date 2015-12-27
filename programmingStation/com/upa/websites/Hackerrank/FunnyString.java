package com.upa.websites.Hackerrank;

/*
 * Author : Pratik Upacharya 
 * Question : https://www.hackerrank.com/challenges/funny-string
 * 
 */
public class FunnyString extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FunnyString in = new FunnyString();
		int t = in.nextInt();
		while ( t > 0 ) {
			// Take String As input 
			String a = in.nextToken();
			int l = a.length();
			int n = l / 2;
			int check = 0;
			for ( int i = 0 ; i < n ; i++, l-- ) {
				int left = Math.abs(a.charAt(i) - a.charAt(i + 1));
				int right = Math.abs(a.charAt(l - 2) - a.charAt(l - 1));
				if (left != right) {
					check = 1;
					break;
				}
			}
			if (check == 0) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}
}
