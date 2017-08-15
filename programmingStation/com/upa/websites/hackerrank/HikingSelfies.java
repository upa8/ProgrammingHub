package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class HikingSelfies extends MyScanner {

	public static void main(String args[]) throws Exception {
		HikingSelfies in = new HikingSelfies();
		int n = in.nextInt();
		int x = in.nextInt();
		int y = (int) (Math.pow(2, n) - 1);
		System.out.println(Math.abs(x - y));
	}
}
