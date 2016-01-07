package com.upa.websites.codechef;

// Wrong output
public class TIMEASR extends MyScanner{
	public static void main(String args[]) throws Exception{
		
		TIMEASR in = new TIMEASR();
		long t = in.nextLong();
		
		while(t>0){
			double n = in.nextDouble();		
			 for(int i = 0; i < 12; i++) {
		            for(int j = 0; j < 60; j++) {
		                if(Math.abs(
		                		(Math.abs(30 * i - 5.5 * (double)j) - n)) < (double)1 / (double)120 ||
		                		Math.abs((Math.abs(30 * i - 5.5 * (double)j - 360) - n)) < (double)1 / (double)120 || 
		                		Math.abs((Math.abs(30 * i - 5.5 * (double)j + 360) - n)) < (double)1 / (double)120) {
		                    if(i < 10) {
		                        System.out.print("0");
		                    }
		                    System.out.print(i);
		                    
		                    System.out.print(":");
		                    if(j < 10) {
		                    	System.out.print("0");
		                    }
		                  }
		                    System.out.print(j);
		                }
		            }
			t--;
		}
	}
}
