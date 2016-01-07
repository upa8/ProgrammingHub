package com.upa.websites.leetCode;
//Determine whether an integer is a palindrome. Do this without extra space.
//Question link : https://leetcode.com/problems/palindrome-number/


public class PallindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        
        int div = 1;
        while(x / div >= 10){
            div *= 10;
        }
        while(x!=0){
            int left = x /div;
            int right = x %10;
            if(left !=  right)
                return false;
            x = (x % div ) /10 ;
            div /=100;
        }
        return true;
        
    }
}