package Hackerrank;

import java.util.Arrays;

/*
 * Author : Pratik Upacharya
 * Question : https://www.hackerrank.com/contests/morgan-stanley-2015/challenges/stock-values 
 */

public class StockValues extends MyScanner{
	public static void main(String args[]) throws Exception{
		StockValues in = new StockValues();
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			Arrays.fill(b, 0);
			for(int i = 0 ; i < n ; i++)
			{
				a[i] = Integer.parseInt(in.nextToken());
			}
			int prev = 0;
			// Find out even numbers and store their min
			int count = 1;
			while(count >0){
				int some = 0;
				for(int i= 2 ; i <n-1 ; i++){
					if(a[i-1] %2 == 0 && a[i+1]%2 == 0 && b[i]!=1 && i>prev ){
								a[i] = (a[i-1] + a[ i+1 ])/2;
								prev = i;
								b[i] = 1;
								some++;
					}
					if(some == 0){
						count = 0;
					}else{
						some = 0;
					}
				}
			}
			int sum = 0;
			for(int i = 0; i<n/2 ; i++){		
				sum = sum + Math.abs(a[i] - a[n-(i+1)]);
			}
			System.out.println(sum);
			t--;
		}
		
	}

}
