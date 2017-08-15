package com.upa.websites.leetCode;

/*
 * Author : Pratik Upacharya 
 * Question : https://leetcode.com/problems/reverse-integer/
 */

public class ReverseInteger {
    public int reverse(int x) {
        
        if(x == Integer.MIN_VALUE) return 0;

        int rev = 0 ;
        boolean pos;
        if(x > 0){
            pos = true;
        }else{
            pos = false;
        }
         x = Math.abs(x);
        while(x>0){
            if(rev > (Integer.MAX_VALUE - x % 10) / 10){
                return 0;
            }

            int a = x % 10 ; 
            x = x /10 ;
            rev = rev * 10 + a ;
        }
        
        if(pos == false){
            return (0-rev);
        }else{
            return rev;
        }
    }
}