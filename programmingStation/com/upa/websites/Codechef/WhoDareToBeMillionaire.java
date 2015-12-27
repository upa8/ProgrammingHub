package com.upa.websites.Codechef;
/*
 * Author : Pratik Upacharya
 * Question : https://www.codechef.com/OCT15/problems/WDTBAM
 * 
 */

public class WhoDareToBeMillionaire extends MyScanner{
	
	public static void main(String args[]) throws Exception{
		WhoDareToBeMillionaire in = new WhoDareToBeMillionaire();
		int t = in.nextInt();
		while(t>0){
			int n = in.nextInt();
			String a = in.nextToken();
			String b = in.nextToken();
			long w[] = new long[n+1];
			for(int j = 0 ; j < n+1 ;j++){
				w[j] = Integer.parseInt(in.nextToken());
			}
			int max = 0;
		//	int count = 0;
		//	int wasPrevious = 0;
			// Logic to find consecutive correct answers
			/*
			for(int i=0; i<n;i++){
				if(a.charAt(i) == b.charAt(i)){
					count++;
					wasPrevious = 1;
				}else{
					wasPrevious = 0;
					count = 0;
				}
				if(wasPrevious == 1){
					if(count > max){
						max = count;
					}	
				}				
			}
			*/
			// Logic to find all the correct answers only (non consecutive)
			for(int i=0; i<n;i++){
				if(a.charAt(i) == b.charAt(i)){
					max++;
				}			
			}
			if(max == a.length())
				System.out.println(w[max]);
			else{
				long newMax = 0;
				for(int i=0; i < max + 1; i++){
					if(w[i] > newMax){
						newMax = w[i];
					}	
				}
				System.out.println(newMax);
			}
			t--;
		}
	}
}
