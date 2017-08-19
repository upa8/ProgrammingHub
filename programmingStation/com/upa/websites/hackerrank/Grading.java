package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class Grading extends MyScanner{
	public static void main(String args[]) throws Exception{
		Grading in = new Grading();
		int n = in.nextInt();
		
		for(int i = 0; i< n; i++){
			int num = in.nextInt();
			if(num < 38){
				System.out.println(num);
			}else{
				int diff = num % 5;
				if(diff < 3){
					System.out.println(num);
				}else{
					System.out.println(num - diff + 5);
				}
			}
		}
		
	}
}
