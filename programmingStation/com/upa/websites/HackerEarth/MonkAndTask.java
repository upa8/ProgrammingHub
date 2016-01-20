package com.upa.websites.hackerEarth;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import com.upa.templates.MyScanner;

public class MonkAndTask extends MyScanner {

	public static void main(String args[]) throws Exception {

		MonkAndTask in = new MonkAndTask();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			// PriorityQueue<Day> pq = new PriorityQueue<Day>();
			TreeMap<Integer, Day> map = new TreeMap<Integer, Day>();
			for (int i = 0; i < n; i++) {
				long x = in.nextLong();
				long z = x;
				int countOne = 0;
				while (x != 0) {
					// taking mod
					long y = in.modulo(x, 2);
					if (y == 1) {
						countOne++;
					}
					// dividing by 2 efficiently
					x = x >> 1;
				}
				// now add this into data structure
				Day d = new Day();
				d.setDay(i);
				d.setValue(z);
				d.setCountOne(countOne);
				map.put(i, d);
				// pq.add(d);
				// tr.put(d, i);
			}
			// System.out.println("Size " + pq.size());
			// System.out.println(tr.size());
			/*
			 * Stack<Long> st = new Stack<Long>(); while (!pq.isEmpty()) { Day d
			 * = pq.poll(); System.out.print(d.getValue() + " ");
			 * System.out.print(d.getDay() + " ");
			 * System.out.print(d.getcountOne() + " ");
			 *
			 * // st.push(d.getValue()); } while (!st.isEmpty()) {
			 * System.out.print(st.pop() + " "); }
			 */
			System.out.println();
		}

	}

	private static long modulo(long S, long N) {
		return ((S) & (N - 1));
	}

}

class Day implements Comparable<Day> {

	private int day;
	private int countOne;
	private long value;

	Day() {

	}

	public int getDay() {
		return this.day;
	}

	public int getcountOne() {
		return this.countOne;
	}

	public long getValue() {
		return this.value;
	}

	public void setDay(int i) {
		this.day = i;
	}

	public void setCountOne(int countOne) {
		this.countOne = countOne;
	}

	public void setValue(long v) {
		this.value = v;
	}

	@Override
	public int compareTo(Day o) {
		// TODO Auto-generated method stub
		return o.countOne - this.countOne;
		// return this.countOne - o.countOne;
	}
}

class ValueComparator implements Comparator {
	Map base;

	public ValueComparator(Map base) {
		this.base = base;
	}

	public int compare(int a, int b) {
		// TODO Auto-generated method stub
		int x = (int) this.base.get(a);
		int y = (int) this.base.get(b);
		if (x >= y) {
			return -1;
		} else {
			return 1;
		} // returning 0 would merge keys
	}

}