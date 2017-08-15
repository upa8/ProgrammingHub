package com.upa.websites.codechef;

import java.util.Arrays;

public class ChefAndTetris extends MyScanner {
	// static Random rand;

	public static void main(String args[]) throws Exception {
		ChefAndTetris in = new ChefAndTetris();
		int t = in.nextInt();
		while (t > 0) {
			// System.out.println("Test " + t);
			int n = in.nextInt();
			long b[] = new long[n];
			long a[] = new long[n];
			int rM = 10;
			for (int i = 0; i < n; i++) {
				b[i] = in.nextLong();// 1 + (int) (Math.random() * ((rM - 1) +
										// 1));
				// System.out.print(b[i] + " ");

			}
			int max = 0;
			// System.out.println();
			for (int i = 0; i < n; i++) {
				a[i] = in.nextLong();// 1 + (int) (Math.random() * ((rM - 1) +
										// 1));
				// ;// in.nextLong();
				// System.out.print(a[i] + " ");
			}
			// System.out.println();
			System.out.println(in.sol(n, b, a));
			t--;
		}
	}

	public long sol(int n, long[] b, long[] a) {
		long visited[] = new long[n];
		long max = 0;
		int indexOfMax = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = max;
				indexOfMax = i;
			}
		}
		long possibleMax[] = new long[8];
		possibleMax[0] = a[indexOfMax];
		if (indexOfMax != 0) {
			possibleMax[1] = a[indexOfMax] + b[indexOfMax - 1];
		}

		return -1;
	}

	public long sol2(int n, long[] b, long[] a) {
		// TODO Auto-generated method stub
		// find max
		// boundry condition
		if (n == 1) {
			return b[0] + a[0];
		}
		long max = 0;
		long maxA[] = new long[8];
		Arrays.fill(maxA, 0);
		long u[] = new long[n];

		for (int i = 0; i < n; i++) {
			if (a[i] >= max) {
				// Check if it has multple values of max number

				maxA[0] = a[i];
				maxA[1] = a[i] + b[i]; //
				if ((i == 0) || (i == (n - 1))) {
					int fact = 0;
					if (i == 0) {
						fact = 1;
					} else {
						fact = -1;
					}
					maxA[2] = a[i] + b[i + fact];
					maxA[3] = a[i] + b[i + fact] + b[i];
					maxA[4] = 0;
					maxA[5] = 0;
					maxA[6] = 0;
					maxA[7] = 0;
				} else {
					int fact = 1;
					maxA[2] = a[i] + b[i + fact];
					maxA[3] = (a[i] + b[i + fact] + b[i]);
					fact = -1;
					maxA[4] = a[i] + b[i + fact];
					maxA[5] = (a[i] + b[i + fact] + b[i]);
					maxA[6] = a[i] + b[i + 1] + b[i - 1];
					maxA[7] = a[i] + b[i + 1] + b[i - 1] + b[i];
				}
				max = a[i];

			}
			u[i] = 0;
		}
		// System.out.println("Max " + max);
		Arrays.sort(maxA);
		// System.out.println("Array Sorted " + max);

		for (int l = maxA.length - 1; l >= 0; l--) {
			max = maxA[l];
			// System.out.println("Checking for max " + max);
			int i = 0;
			Arrays.fill(u, 0);
			for (i = 0; i < n; i++) {
				// Generalized conditions
				// System.out.println(" a[i] " + a[i] + " max " + max);
				if (a[i] == max) {
					// System.out.println(" a[i] == " + a[i] + " max " + max);
					continue;
				} else {
					if (((a[i] + b[i]) == max) && (u[i] == 0)) {
						u[i] = 1;

						continue;
					} else {
						if ((i == 0) || (i == (n - 1))) {
							int fact = 0;
							if (i == 0) {
								fact = 1;
							} else {
								fact = -1;
							}
							if (((a[i] + b[i + fact]) == max)
									&& (u[i + fact] == 0)) {
								u[i + fact] = 1;
								continue;
							} else {
								if (((a[i] + b[i + fact] + b[i]) == max)
										&& (u[i + fact] == 0) && (u[i] == 0)) {
									u[i] = 1;
									u[i + fact] = 1;
									continue;
								} else {
									break;
								}

							}

						} else {

							int fact = 1;
							if (((a[i] + b[i + fact]) == max)
									&& (u[i + fact] == 0)) {
								u[i + fact] = 1;
								continue;
							} else {
								if (((a[i] + b[i + fact] + b[i]) == max)
										&& (u[i + fact] == 0) && (u[i] == 0)) {
									u[i] = 1;
									u[i + fact] = 1;
									continue;
								} else {
									fact = -1;
									if (((a[i] + b[i + fact]) == max)
											&& (u[i + fact] == 0)) {
										u[i + fact] = 1;
										continue;
									} else {
										if (((a[i] + b[i + fact] + b[i]) == max)
												&& (u[i + fact] == 0)
												&& (u[i] == 0)) {
											u[i] = 1;
											u[i + fact] = 1;
											continue;
										} else {

											if (((a[i] + b[i + 1]
													+ b[i - 1]) == max)
													&& (u[i + 1] == 0)
													&& (u[i - 1] == 0)) {
												u[i + 1] = 1;
												u[i - 1] = 1;
												continue;
											} else {
												if (((a[i] + b[i + 1] + b[i - 1]
														+ b[i]) == max)
														&& (u[i + 1] == 0)
														&& (u[i - 1] == 0)
														&& (u[i] == 0)) {
													u[i + 1] = 1;
													u[i - 1] = 1;
													u[i] = 1;
													continue;
												} else {
													break;
												}

											}

										}
									}
								}
							}
						}
					}
				}
			}
			// System.out.println("End checking i is " + i);
			if (i == n) {
				// for (int j = 0; j < n; j++) {
				// if (u[j] == 0) {
				// System.out.println("Here " + b[j]);
				// return -1;
				// }
				// }
				return max;
			}
		}
		// Comment this
		return -1;
	}

}
