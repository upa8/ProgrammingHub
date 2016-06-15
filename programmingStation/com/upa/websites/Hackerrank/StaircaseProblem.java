package com.upa.websites.hackerrank;

import java.util.Scanner;

/*
 * Problem Link :
 * 		https://www.hackerrank.com/challenges/staircase
 *
 */

public class StaircaseProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < (a - i - 1); j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < (i + 1); k++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
