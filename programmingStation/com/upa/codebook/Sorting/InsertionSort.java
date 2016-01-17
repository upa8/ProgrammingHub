package com.upa.codebook.sorting;

public class InsertionSort {
	public static void main(String args[]) {

		InsertionSort in = new InsertionSort();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
		}

		in.printArray(a);
		System.out.println();
		in.insertionSort(a, in);
		System.out.println();
		// in.printArray(a);

	}

	public void printArray(int a[]) {
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}

	public void insertionSort(int a[], InsertionSort in) {
		for (int i = 1; i < a.length; i++) {
			int v = a[i];
			int j = i;
			while ((a[j - 1] > v) && (j >= 0)) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;

			in.printArray(a);
			System.out.println();
		}
	}

}
