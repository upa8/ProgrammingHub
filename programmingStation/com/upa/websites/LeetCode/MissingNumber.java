package com.upa.websites.LeetCode;

import java.util.HashMap;
/*
 * Author : Pratik Upacharya
 * question : Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
	
	For example,
	Given nums = [0, 1, 3] return 2.
	
	Note:
	Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * Link : https://leetcode.com/problems/missing-number/
 *
 */


public class MissingNumber {
    public int missingNumber(int[] nums) {
        int length = nums.length; 
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < length ; i++){
            hm.put(nums[i],nums[i]);
        }
        int i;
        for( i = 0 ; i < length ; i++){
            if(!hm.containsKey(i)){
                return i;
            }
        }
        return (i);
    }
}