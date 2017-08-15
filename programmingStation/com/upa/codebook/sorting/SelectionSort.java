package com.upa.codebook.sorting;

public class SelectionSort {
	public static void main(String args[]) {

		SelectionSort in = new SelectionSort();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
		}

		in.printArray(a);
		in.selectionSort(a);
		System.out.println();
		in.printArray(a);

	}

	public void printArray(int a[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void selectionSort(int a[]) {
		int min = 0;
		for (int i = 0; i < (a.length - 1); i++) {
			min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
	}

}
