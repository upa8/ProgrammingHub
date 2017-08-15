package com.upa.websites.leetCode;

import java.util.HashMap;

/*
 * Author : Pratik Upacharya
 * Question : https://leetcode.com/problems/two-sum/
 */

public class TwoSum {

	public static void main(String args[]) {

		TwoSum prob = new TwoSum();
		int numbs[] = new int[] { 3, 2, 4 };
		int target = 6;
		System.out.println(prob.twoSum(numbs, target));
	}

	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> elementStorage = new HashMap<Integer, Integer>();
		int totalElements = nums.length;
		for (int i = 0; i < totalElements; i++) {
			int getCurrentElement = nums[i];
			int expectedElement = target - getCurrentElement;
			System.out.println(elementStorage.containsKey(expectedElement));
			if (elementStorage.containsKey(expectedElement)) {
				int solution[] = new int[2];
				solution[0] = elementStorage.get(expectedElement);
				solution[1] = i;
				return new int[] { elementStorage.get(expectedElement), i };
			} else {
				System.out.println("Reached");
				elementStorage.put(getCurrentElement, i);
			}
		}
		return nums;
	}

	/*
	 * public class Solution { public int[] twoSum(int[] numbers, int target) {
	 *
	 * HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
	 *
	 * for(int i = 0; i < numbers.length; i++){ m.put(target - numbers[i], i); }
	 *
	 * for(int i = 0; i < numbers.length; i++){
	 *
	 * Integer v = m.get(numbers[i]);
	 *
	 * if(v != null && v != i){ return new int[]{i + 1, v + 1}; } }
	 *
	 * throw new RuntimeException(); } }
	 */
}
