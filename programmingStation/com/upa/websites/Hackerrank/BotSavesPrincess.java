package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

/*
 *  Question : https://www.hackerrank.com/challenges/saveprincess
 *  Editorials :
 *  Solutions Approach :
 *
 */

public class BotSavesPrincess extends MyScanner {

	public static void main(String args[]) throws Exception {
		BotSavesPrincess in = new BotSavesPrincess();
		int n = in.nextInt();
		int mi = 0;
		int mj = 0;
		int pi = 0;
		int pj = 0;
		for (int i = 0; i < n; i++) {
			String s = in.nextToken();
			for (int j = 0; j < n; j++) {
				if (s.charAt(j) == 109) {
					mi = i;
					mj = j;
				}
				if (s.charAt(j) == 112) {
					pi = i;
					pj = j;
				}
			}
		}
		int count = (int) Math
				.abs(2 * Math.sqrt(((Math.abs(mi - pi) * Math.abs(mi - pi))
						+ (Math.abs(mj - pj) * Math.abs(mj - pj)))));
		// Now check position of princess with respect to bot
		// Now we have four cases
		if ((pi < mi) && (pj < mj)) {
			// Princess at left upmost corner
			// First move will be down and then right
			for (int i = 1; i < count; i++) {
				if ((i % 2) != 0) {
					System.out.println("UP");
				}
				{

					System.out.println("LEFT");
				}
			}
		}
		if ((pi > mi) && (pj > mj)) {
			// Princess at bottom right most corner
			// First move will be UP and Left
			for (int i = 1; i < count; i++) {
				if ((i % 2) != 0) {
					System.out.println("DOWN");
				}
				{

					System.out.println("RIGHT");
				}
			}
		}
		if ((pi < mi) && (pj > mj)) {
			// Princess at right up most corner
			// First move will be down and then LEFT
			for (int i = 1; i < count; i++) {
				if ((i % 2) != 0) {
					System.out.println("UP");
				}
				{

					System.out.println("RIGHT");
				}
			}
		}
		if ((pi > mi) && (pj < mj)) {
			// Princess at left bottom most corner
			// First move will be UP and then right
			for (int i = 1; i < count; i++) {
				if ((i % 2) != 0) {
					System.out.println("DOWN");
				}
				{

					System.out.println("LEFT");
				}
			}
		}
	}
}
