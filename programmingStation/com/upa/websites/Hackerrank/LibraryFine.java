package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class LibraryFine extends MyScanner {

	public static void main(String args[]) throws Exception {
		MyScanner in = new MyScanner();
		int ad = Integer.parseInt(in.nextToken());
		int am = Integer.parseInt(in.nextToken());
		int ay = Integer.parseInt(in.nextToken());
		int rd = Integer.parseInt(in.nextToken());
		int rm = Integer.parseInt(in.nextToken());
		int ry = Integer.parseInt(in.nextToken());
		int fine = 0;
		System.out.println(ad + " " + am + " " + ay + " ");

		System.out.println(rd + " " + rm + " " + ry + " ");
		if (ry == ay) {
			if (rm == am) {

			} else {
				if (rm > am) {

				}
			}

		} else {
			if (ry > ay) {
				fine = 10000;
			}
		}
		System.out.println(fine);

	}
}
