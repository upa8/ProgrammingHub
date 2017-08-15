package com.upa.websites.hackerEarth;

import java.util.PriorityQueue;

import com.upa.templates.MyScanner;

public class MonkAndMultiplication extends MyScanner {

	public static void main(String args[]) throws Exception {
		MonkAndMultiplication in = new MonkAndMultiplication();
		int num = in.nextInt();
		int[] array = new int[num];
		for (int i = 0; i < num; i++) {
			array[i] = in.nextInt();
		}
		PriorityQueue<Integer> pq = new PriorityQueue();
		int k = 0;
		while (k < num) {
			pq.add(array[k]);
			if (pq.size() < 3) {
				System.out.println(-1);
			} else if (pq.size() == 3) {
				int a = pq.remove();
				int b = pq.remove();
				int c = pq.remove();
				System.out.println(a * b * c);
				pq.add(a);
				pq.add(b);
				pq.add(c);
			} else {
				pq.remove();
				int a = pq.remove();
				int b = pq.remove();
				int c = pq.remove();
				System.out.println(a * b * c);
				pq.add(a);
				pq.add(b);
				pq.add(c);

			}
			k++;
		}

	}
}
