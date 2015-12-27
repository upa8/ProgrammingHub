package LeetCode;
/*
 * Author : Pratik Upacharya
 * 
 * Question : https://leetcode.com/problems/perfect-squares/
 * 
 * Given a positive integer n, find the least number of perfect square numbers (for example, 1, 4, 9, 16, ...) which sum to n.

For example, given n = 12, return 3 because 12 = 4 + 4 + 4; given n = 13, return 2 because 13 = 4 + 9.



Logic : 


 */



public class PerfectSquare {
    public int numSquares(int n) {
        
        int a[]  = new int[n+1];
        if(n > 3){
                a[0] = 0;
                a[1] = 1;
                a[2] = 2;
                a[3] = 3;
                
                   for(int i = 4 ; i<= n ; i++)
                    {
                        a[i] = i ;
                        
                        for(int x = 1 ; x<=i ; x++){
                            int temp = x*x;
                            if(temp>i){
                                break;
                            }else{
                                a[i] = Math.min(a[i] , 1+a[i-temp]);
                            }
                        }
                        
                    }
                    int res = a[n];
                    return res;
        }else{
            return n;
        }
        
    }
}