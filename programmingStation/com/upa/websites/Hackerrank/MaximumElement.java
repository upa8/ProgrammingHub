package com.upa.websites.Hackerrank;
/*
 * Question :
 * 		https://www.hackerrank.com/challenges/maximum-element
 */

import java.util.Stack;

public class MaximumElement extends MyScanner {

	public static void main(String[] args) throws Exception {

		MaximumElement in = new MaximumElement();
		long n = in.nextInt();
		long firstMax = 0;
		long secondMax = 0;
		Stack<Long> st = new Stack<Long>();

		long count = 0;
		while (n > 0) {
			// count++;
			int first = Integer.parseInt(in.nextToken());
			if (first == 1) {
				long next = Integer.parseInt(in.nextToken());
				if (next > firstMax) {
					secondMax = firstMax;
					firstMax = next;
				}

				st.push(next);
			}
			if (first == 2) {
				if (st.peek() == firstMax) {
					firstMax = secondMax;
				}
				st.pop();
			}
			if (first == 3) {

				// System.out.println(firstMax + " " + count + " " + n);
				System.out.println(firstMax);

			}
			n--;
		}
		// System.out.println("Count is : " + count);

	}
}
