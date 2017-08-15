package com.upa.testing;

import com.upa.templates.MyScanner;

public class BirthdayCakeCandles extends MyScanner{
	
	public static void main(String args[]) throws Exception{
		
		BirthdayCakeCandles in = new BirthdayCakeCandles();
		
		int nYear = in.nextInt();
	
		long max = -1;
		int count = 0;
		while(nYear > 0){
			long candle = in.nextLong();
			if(max == candle){
				count++;
				nYear--;
				continue;
			}
			if(max < candle){
				max = candle; 
				count = 1;
			}
			nYear--;
		}
		
		System.out.println(count);
	}
}
