package com.upa.websites.leetCode;

/*
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
 * 
 * 
public class Solution {
    public int addDigits(int num) {
        return num - (num - 1) / 9 * 9;
    }
}
*/
/*
 * 
One solution . 
public class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while(num>0){
            num /= 10;
            sum += (num%10);
            if(num == 0){
                num = sum;
                if(num >=10)
                    continue;
                else
                    return num;
            }
        }
        return num;
    }
}
*/