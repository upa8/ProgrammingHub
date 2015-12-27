package com.upa.websites.LeetCode;
import java.util.HashMap;
/*
 * Author : Pratik Upacharya
 * Question : Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.


Link : https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int length = nums.length;
        System.out.println("Length " + length);
        for(int i = 0 ; i< length ; i++)
            hm.put(nums[i] , nums[i] );
        int i = 0 ;
        if(length == 0)
            return 1;
        for(i = 1 ; i<=length ; i++){
            System.out.println("i :"+i);
            if(!hm.containsKey(i)){
                return (i);
            }
        }
        return (i);
    }
}