package com.upa.websites.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Love_Letter_Mystery {
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
        
		byte t = Byte.parseByte(br.readLine());
		while(t > 0){
			String temp = br.readLine();
			int count = 0;
			int last = temp.length();
			int first = 0 ; 
			int mid = (first + last + 1) /2;
			if(last % 2 == 0){
				int s = last /2; 
				if(temp.charAt(s) > temp.charAt(s-1))
					count = temp.charAt(s) - temp.charAt(s-1);
				else
					count = temp.charAt(s-1) - temp.charAt(s);
				mid = s-1;
			}
						for (int i =  0 ; i < mid ; i ++){
							int f = temp.charAt(first);
							int l = temp.charAt(last-1);
							if(f == l){
								first++;
								last--;
							}else{
									if(f > l){
										count += f - l;
										
									}else{
										count += l - f ;
									}
									first++;
									last--;
							}
						}
		
			sb.append(count + "\n");
			
			t--;
			
		}
		System.out.print(sb);
		
	}
	
}
