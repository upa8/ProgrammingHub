package com.upa.websites.hackerEarth;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.PriorityQueue;
import java.util.Stack;

import com.upa.templates.MyScanner;

public class MonkAndTask extends MyScanner {
	static PrintWriter out;

	public static void main(String args[]) throws Exception {

		MonkAndTask in = new MonkAndTask();
		out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			PriorityQueue<Day> pq = new PriorityQueue<Day>();
			pq.clear();
			// TreeMap<Integer, Day> map = new TreeMap<Integer, Day>();
			for (int i = 0; i < n; i++) {
				String str = in.nextToken();
				BigInteger val = new BigInteger(str);
				int bitCount = val.bitCount();
				Day d = new Day();
				d.setDay(i);
				d.setValue(str);
				d.setCountOne(bitCount);
				pq.add(d);
			}
			Stack<Day> st = new Stack<Day>();
			st.clear();
			while (!pq.isEmpty()) {
				Day d = pq.poll();
				st.push(d);
			}
			StringBuilder ans = new StringBuilder();
			while (!st.isEmpty()) {
				Day d = st.pop();
				// System.out.print(d.getValue() + " ");
				String val = d.getValue();
				ans.append(val + " ");
				// out.write(val + " ");
			}
			System.out.println(ans);
			// out.write("\n");
		}
		out.close();

	}

	private static long modulo(long S, long N) {
		return ((S) & (N - 1));
	}

}

class Day implements Comparable<Day> {

	private int day;
	private int countOne;
	private String value;

	Day() {

	}

	public int getDay() {
		return this.day;
	}

	public int getcountOne() {
		return this.countOne;
	}

	public String getValue() {
		return this.value;
	}

	public void setDay(int i) {
		this.day = i;
	}

	public void setCountOne(int countOne) {
		this.countOne = countOne;
	}

	public void setValue(String str) {
		this.value = str;
	}

	@Override
	public int compareTo(Day o) {
		// TODO Auto-generated method stub
		return o.countOne - this.countOne;
		// return this.countOne - o.countOne;
	}
}
