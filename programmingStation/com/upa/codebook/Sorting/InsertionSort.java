package com.upa.codebook.sorting;

public class InsertionSort {
	public static void main(String args[]) {

		InsertionSort in = new InsertionSort();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
		}

		in.printArray(a);
		in.insertionSort(a);
		System.out.println();
		in.printArray(a);

	}

	public void printArray(int a[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void insertionSort(int a[]) {
		for (int i = 2; i <= (a.length - 1); i++) {
			int v = a[i];
			int j = i;
			while ((a[j - 1] > v) && (j >= 1)) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;
		}
	}

}
