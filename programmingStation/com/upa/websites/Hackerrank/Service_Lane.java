package com.upa.websites.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Service_Lane {
	public static void main(String[] args ) throws IOException{
		StringBuffer sb = new StringBuffer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Get Input
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        short T = Short.parseShort(temp[1]);
        byte[] width = new byte[N];
        temp = br.readLine().split(" ");
        for(int i = 0; i < N; ++i){
            width[i] = Byte.parseByte(temp[i]);
        }
        while(T> 0){
        	temp = br.readLine().split(" ");
            int i = Integer.parseInt(temp[0]);
            int j = Integer.parseInt(temp[1]);
            int min = width[i-1];
            	for(int m = i ; m < j ; m ++){
					if(min > width[m]){
						min = width[m];
					}
					
			}
            	sb.append(min + "\n");
			T--;
		}
        System.out.print(sb);
	}

}
