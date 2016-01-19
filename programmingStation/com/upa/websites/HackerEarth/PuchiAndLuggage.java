package com.upa.websites.hackerEarth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Try solving this problem using fenweek tree
 */

public class PuchiAndLuggage {

	static int totalfrnd;
	static int weight[];
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str = br.readLine();
		// test cases
		int t = Integer.parseInt(str);

		for (int m = 0; m < t; m++) {
			arr = new int[1000005];
			// take n
			totalfrnd = Integer.parseInt(br.readLine());
			// create array of n elements
			weight = new int[totalfrnd];
			// put all n elements in array
			for (int j = 0; j < totalfrnd; j++) {
				weight[j] = Integer.parseInt(br.readLine());
			}
			// create a copy of array
			int weightcopy[] = new int[totalfrnd];
			for (int i = 0; i < totalfrnd; i++) {
				weightcopy[i] = weight[i];
			}

			mergesort(0, totalfrnd - 1);
			for (int i = 0; i < totalfrnd; i++) {
				System.out.print(arr[weightcopy[i]] + " ");

			}
			System.out.println();
		}

	}

	static public void mergesort(int left, int right) {
		if (right > left) {
			int mid = (right + left) / 2;
			mergesort(left, mid);
			mergesort(mid + 1, right);
			merge(left, mid + 1, right);

		}
	}

	static public void merge(int lowptr, int highptr, int highbound) {
		int lowbound = lowptr;
		int mid = highptr - 1;
		int n = (highbound - lowbound) + 1;
		int count = 0;
		int k = 0;
		int copy[] = new int[n];
		while ((lowptr <= mid) && (highptr <= highbound)) {
			if (weight[lowptr] <= weight[highptr]) {
				copy[count++] = weight[lowptr++];
				arr[weight[lowptr - 1]] += k;
			} else {
				copy[count++] = weight[highptr++];
				k++;
			}
		}
		while (lowptr <= mid) {
			copy[count++] = weight[lowptr++];
			arr[weight[lowptr - 1]] += k;

		}

		while (highptr <= highbound) {
			copy[count++] = weight[highptr++];
			k++;
		}
		for (int i = 0; i < n; i++) {
			weight[lowbound + i] = copy[i];
		}
	}
}
