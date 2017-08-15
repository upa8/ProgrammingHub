package com.upa.websites.hackerrank;

import java.util.ArrayDeque;
import java.util.ArrayList;

import com.upa.templates.MyScanner;

public class PoisonousPlant extends MyScanner {

	public static void main(String args[]) throws Exception {

		PoisonousPlant in = new PoisonousPlant();

		int n = in.nextInt();
		ArrayList<Long> arr = new ArrayList<Long>();
		while (n > 0) {
			arr.add(in.nextLong());
			n--;
		}
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
		boolean flag = true;
		int countDays = 0;
		while (flag) {
			for (int i = 1; i < arr.size(); i++) {
				if (arr.get(i - 1) < arr.get(i)) {
					dq.add(i);
				}
			}
			if (dq.isEmpty()) {
				flag = false;
				break;
			} else {
				while (!dq.isEmpty()) {
					int index = dq.pollLast();
					arr.remove(index);
				}
			}
			countDays++;
		}
		System.out.println(countDays);
	}
}
