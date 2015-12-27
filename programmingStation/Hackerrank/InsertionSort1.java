package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function
    	int n  = ar.length;
        for (int k = 1 ; k < n ; ++k){
            int temp  = ar[k];
            int   j = k-1;
            int loc = Arrays.binarySearch(ar, 0,  j , temp);
            System.out.println( "Loc"+loc);
            while(j >=loc ){
                ar[j+1] = ar[j];
                j--;
            //    printArray(ar);
            }
            ar[j+1] = temp;
            
        }
        printArray(ar);
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}