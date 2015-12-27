package com.upa.websites.Codechef;

import java.util.*;

import com.upa.websites.Hackerrank.MyScanner;

import java.io.*;



public class Donuts extends MyScanner{
	public static void main(String args[]) throws Exception{
		Donuts in = new Donuts();
		int t = in.nextInt();
		while(t>0){
			int n = Integer.parseInt(in.nextToken());
			int m = Integer.parseInt(in.nextToken());
			int arr[] = new int[m];
			for(int i = 0 ; i < m ; i++){
				arr[i] = Integer.parseInt(in.nextToken());
			}
			Arrays.sort(arr);
			int counter  = m; 
			int cuts = 0 ;
			int cutIndex = 0;
			while(counter>1){
				if(arr[cutIndex] ==1){
					counter -=2;
					cutIndex++;
					cuts++;
				}else{
					counter -= 1;
					arr[cutIndex] -= 1 ;
					cuts++;
				}
			}
			System.out.println(cuts);
			t--;
		}
		
				
	}
	
}

