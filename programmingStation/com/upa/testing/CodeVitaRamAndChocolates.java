package com.upa.testing;

import com.upa.templates.MyScanner;

public class CodeVitaRamAndChocolates extends MyScanner {

	public static void main(String args[]) throws Exception {

		CodeVitaRamAndChocolates in = new CodeVitaRamAndChocolates();
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		// now apply bubble sort
		// to sort and count the swapping
		// as step of rearrangements
		int steps = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if ((a[i] > a[j]) && (a[i] != a[j])) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
					steps++;
				}
			}
		}
		// Now again check for re-arrangements
		int change = 0;
		for (int i = 1; i < n; i++) {
			int first = a[i - 1];
			int current = a[i];
			if (current == (first + 3)) {
				continue;
			} else {
				int x = current - first;
				int y = x - 3;
				change += y;
				a[i] = first + 3;
				steps++;
			}
		}
		if (change == 0) {
			System.out.println("Yes " + (steps / 2));
		} else {
			System.out.println("No");
		}
	}
}
