package com.upa.websites.hackerrank;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.upa.templates.MyScanner;

public class LuckBalance extends MyScanner {

	static class pair<X, Y> {
		X _first;
		Y _second;

		public pair(X f, Y s) {
			this._first = f;
			this._second = s;
		}

		X first() {
			return this._first;
		}

		Y second() {
			return this._second;
		}

		void setFirst(X f) {
			this._first = f;
		}

		void setSecond(Y s) {
			this._second = s;
		}
	}

	public static void main(String args[]) throws Exception {
		LuckBalance in = new LuckBalance();

		int n = in.nextInt();
		int k = in.nextInt();

		PriorityQueue<pair<Integer, Integer>> pq = new PriorityQueue<pair<Integer, Integer>>(
				1, new Comparator<pair<Integer, Integer>>() {
					@Override
					public int compare(pair<Integer, Integer> i,
							pair<Integer, Integer> j) {
						int x = i.second().compareTo(j.second());
						if (x == 0) {
							return i.first() - j.first();
						} else {
							return j.second() - i.second();
						}
					}
				});
		int countImp = 0;
		int totalSum = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			pq.offer(new pair<Integer, Integer>(x, y));
			if (y == 1) {
				countImp++;
			}
			totalSum = totalSum + x;
		}
		int sub = countImp - k;
		int newSum = 0;
		for (int i = 0; i < n; i++) {
			pair<Integer, Integer> result = pq.poll();
			if (sub > 0) {
				newSum = newSum - result.first();
				sub--;
			} else {
				newSum = newSum + result.first();
			}
		}
		System.out.println(newSum);
	}
}
