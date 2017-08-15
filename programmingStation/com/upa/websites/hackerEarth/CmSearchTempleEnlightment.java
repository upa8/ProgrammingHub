package com.upa.websites.hackerEarth;

import java.util.Arrays;

import com.upa.templates.MyScanner;

public class CmSearchTempleEnlightment extends MyScanner {
	public static void main(String args[]) throws Exception {
		CmSearchTempleEnlightment in = new CmSearchTempleEnlightment();
		int n = in.nextInt();
		int k = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		// Sort array
		Arrays.sort(arr);
		// in.printArray(arr);

		int first = 0;
		int last = 10000000;
		int middle = (first + last) / 2;
		// System.out.println("Middle " + middle);
		while (first <= last) {
			int x = check(middle, arr, k);
			// System.out.println("X " + x);
			if ((x == 1) && (check(middle - 1, arr, k) == 0)) {
				// System.out.println("break ");
				break;
			}
			if (x == 0) {
				first = middle + 1;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		System.out.println(middle);
	}

	public static int check(int num, int arr[], int k) {
		int i, j, prev = arr[0] + num;
		k--;
		// System.out.println("prev " + prev);
		for (i = 1; i < arr.length; i++) {
			// System.out
			// .println("prev+ num " + (prev + num) + " arr[i]" + arr[i]);
			if ((prev + num) >= arr[i]) {
				// System.out.println("continue");
				continue;
			}
			if (k == 0) {
				return 0;
			}
			// System.out.println("Selected one spot at" + prev);
			prev = arr[i] + num;
			k--;
		}
		return 1;
	}

	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i] + " ");
		}
	}
}
