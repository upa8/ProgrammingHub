package com.upa.websites.codechef;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayDeque;

import com.upa.templates.MyScanner;

public class ChefLandAndElectricity extends MyScanner {
	static PrintWriter out;

	public static void main(String argrs[]) throws Exception {
		ChefLandAndElectricity in = new ChefLandAndElectricity();
		out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = in.nextInt();
		while (t > 0) {
			// System.out.println("test" + t);
			int n = in.nextInt();
			long xCordinate[] = new long[n];
			String str = in.nextToken();
			// str = str.trim();
			for (int i = 0; i < n; i++) {
				xCordinate[i] = in.nextLong();
			}
			long w = in.sol(n, str, xCordinate);
			// System.out.println(w);
			out.println(w);
			t--;
		}
		out.close();
		// System.out.println(ans.toString());
	}

	public long sol(int n, String str, long[] xCordinate) {
		ArrayDeque<Integer> nextOne = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (c == '1') {
				nextOne.add(i);
			}
		}
		long minSum = 0;
		int Size = nextOne.size();
		// System.out.println("Size" + Size);
		int firstOne = nextOne.pollFirst();
		// System.out.println("FirstOne" + firstOne);
		// Sum added till first one
		for (int i = 0; i < firstOne; i++) {
			minSum = minSum + (xCordinate[i + 1] - xCordinate[i]);
		}
		// System.out.println("MinSum " + minSum);

		while (!nextOne.isEmpty()) {
			// System.out.println("In while");
			int secondOne = nextOne.pollFirst();
			// System.out.println("SecondOne" + secondOne);
			if (secondOne == (firstOne + 1)) {
				firstOne = secondOne;
				continue;
			}

			long max = 0;

			for (int i = firstOne + 1; i <= secondOne; i++) {
				long y = xCordinate[i] - xCordinate[i - 1];
				// System.out.println("y : " + y);
				if (y > max) {
					max = y;
				}
				// System.out.println("minSum : " + minSum);
				minSum = minSum + y;
				// System.out.println("After minSum : " + minSum);
			}
			minSum = minSum - max;
			firstOne = secondOne;
		}
		// System.out.println("A " + minSum);
		// add tailing zeros
		for (int i = firstOne + 1; i < n; i++) {
			minSum = minSum + (xCordinate[i] - xCordinate[i - 1]);
			// System.out.println("In tail " + minSum);
		}

		// System.out.println("End of program minSum " + minSum);
		return minSum;

	}

	// This solution did not worked
	public long sol1(int n, String str, long[] xCordinate) {
		// TODO Auto-generated method stub
		// System.out.println("New Test");
		ArrayDeque<Integer> nextOne = new ArrayDeque<Integer>();
		for (int i = 0; i < n; i++) {
			char c = str.charAt(i);
			if (c == '1') {
				nextOne.add(i);
			}
		}
		long minSum = 0;
		int Size = nextOne.size();
		System.out.println("Size" + Size);
		int firstOne = nextOne.pollFirst();
		System.out.println("FirstOne" + firstOne);
		// Sum added till first one
		for (int i = 0; i < firstOne; i++) {
			minSum = minSum + (xCordinate[i + 1] - xCordinate[i]);
		}
		System.out.println("MinSum " + minSum);
		// now sum between first one and next one
		// Between middle ones
		while (!nextOne.isEmpty()) {
			System.out.println("In while");
			int secondOne = nextOne.pollFirst();
			System.out.println("SecondOne" + secondOne);
			if (secondOne == (firstOne + 1)) {
				firstOne = secondOne;
				continue;
			}

			for (int i = firstOne + 1; i < secondOne; i++) {
				long x = xCordinate[i] - xCordinate[firstOne];
				long y = xCordinate[secondOne] - xCordinate[i];
				long m = xCordinate[i] - xCordinate[i - 1];

				if ((x == y) || (x > y)) {
					if (y > m) {
						int l = i + 1;
						long p = xCordinate[l] - xCordinate[i];
						if (m > p) {
							minSum += y;
							break;
						} else {
							minSum += m;
						}

					} else {
						minSum += y;
						System.out.println("x " + x + " Y " + y + " m " + m
								+ " minSum " + minSum);

						break;
					}
				}
				if (y > x) {
					minSum += m;
				}
				System.out.println(
						"x " + x + " Y " + y + " m " + m + " minSum " + minSum);
			}

			firstOne = secondOne;
		}
		System.out.println("A" + minSum);
		// add tailing zeros
		for (int i = firstOne + 1; i < n; i++) {
			minSum = minSum + (xCordinate[i] - xCordinate[i - 1]);
			System.out.println("In tail " + minSum);
		}

		// System.out.println("End of program minSum " + minSum);
		return minSum;
	}
}
