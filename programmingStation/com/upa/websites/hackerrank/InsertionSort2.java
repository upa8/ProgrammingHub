package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class InsertionSort2 extends MyScanner {

	public static void main(String args[]) throws Exception {

		InsertionSort2 in = new InsertionSort2();

		int s = in.nextInt();
		int a[] = new int[s];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		int v, j;
		for (int i = 1; i < a.length; i++) {
			v = a[i];
			j = i;
			while ((a[j - 1] > v) && (j >= 1)) {
				a[j] = a[j - 1];
				j--;
				if (j == 0) {
					break;
				}
			}
			a[j] = v;
			in.printArray(a);
			System.out.println();
		}
	}

	public void printArray(int a[]) {
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}
}
