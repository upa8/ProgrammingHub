package com.upa.codebook.sorting;

public class BubbleSort {

	public static void main(String args[]) {

		BubbleSort in = new BubbleSort();

		int a[] = new int[10];

		for (int i = 0; i < 10; i++) {
			a[i] = (int) (Math.random() * 10);
		}

		in.printArray(a);
		in.improvedBubbleSort(a);
		// in.bubbleSort(a);
		System.out.println();
		in.printArray(a);

	}

	public void printArray(int a[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public void bubbleSort(int a[]) {
		for (int pass = a.length - 1; pass >= 0; pass--) {
			for (int i = 0; i <= (pass - 1); i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
	}

	public void improvedBubbleSort(int a[]) {
		int swapped = 1;
		for (int pass = a.length - 1; (pass >= 0) && (swapped == 1); pass--) {
			swapped = 0;
			for (int i = 0; i < (pass - 1); i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = 1;
				}
			}
		}

	}

}
