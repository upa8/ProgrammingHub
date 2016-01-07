package com.upa.websites.hackerrank;

import java.util.HashMap;
import java.util.Map;

import com.upa.templates.MyScanner;

/*
 * Author : Pratik Upacharya
 * Problem : https://www.hackerrank.com/challenges/cut-the-sticks
 * Algorithm :
 *
 */
public class CutTheSticks extends MyScanner {
	static int min = 10000;
	// HashMap<Integer , Integer> hm ;
	static int check = 0;

	public static void main(String[] args) throws Exception {

		CutTheSticks in = new CutTheSticks();
		// Get the number of elements
		int N = in.nextInt();
		// put those elements in hashmap
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < N; i++) {
			int a = Integer.parseInt(in.nextToken());
			hm.put(i, a);
		}
		// System.out.println(hm);
		// Algorithm
		Boolean flag = true;
		while (check == 0) {
			// Find Minimum number in hashmap (Will take O(n))
			// System.out.println("Hashmap before delete "+hm);
			min = in.minimumValueInHashMap(hm);
			// System.out.println("min " + min);
			// This method will delete min number from hashmap , and will delete
			// entries with zero
			in.subtrackMinFromHashMap(min, hm);
			// System.out.println("After delete"+hm);
		}

	}

	private HashMap<Integer, Integer> subtrackMinFromHashMap(int min,
			HashMap<Integer, Integer> hm) {
		// TODO Auto-generated method stub

		int size = hm.size();
		int count = 0;
		for (int i = 0; i < size; i++) {
			int value = hm.get(i);
			if (value > 0) {
				int x = Math.abs((min - value));
				count++;
				hm.put(i, x);
			}
		}
		if (count == 0) {
			check = 1;
		} else {
			System.out.println(+count);

		}
		return hm;
	}

	public int minimumValueInHashMap(HashMap<Integer, Integer> hm) {
		// TODO Auto-generated method stub
		int a = 2000;
		for (Map.Entry me : hm.entrySet()) {
			int x = (int) me.getValue();
			if ((a > x) && (x != 0)) {
				a = x;
			}
			min = a;
		}
		return min;
	}

}
