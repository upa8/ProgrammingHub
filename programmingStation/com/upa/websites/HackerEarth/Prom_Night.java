package com.upa.websites.HackerEarth;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.*;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.math.*;

class Prom_Night{
    public static void main (String [] args) throws Exception{
    	solve s = new solve();
    	s.sol();
    }
}

class solve {
	
    public void sol() throws Exception {
    	ModScanner in= new ModScanner();
    	PrintWriter pw = new PrintWriter(System.out);
        int t = in.nextInt();
        for(int tc=0;tc<t;tc++){
        	int males=in.nextInt();
        	int females=in.nextInt();
            int marr[]= new int[males];
            int farr[]= new int[females];
            for(int i= 0;i<males;i++)
            	marr[i]=in.nextInt();
            for(int i=0;i<females;i++)
            	farr[i]=in.nextInt();
            if(females<males)
            	pw.println("NO");
            else{
            	Arrays.sort(marr);
            	Arrays.sort(farr);
            	int fl=-1;
            	for(int i=0,j=0;i<males && j<females;i++,j++){
            		if(marr[i]<=farr[j]){
            			fl=0;
            			break;
            		}	
            	}
            	if(fl==0)
            		pw.println("NO");
            	else
            		pw.println("YES");
            }
        }
        pw.flush();
  }
}
class ModScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public ModScanner() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
	String nextToken() throws Exception {

		while (st == null || !st.hasMoreElements()) {
				st = new StringTokenizer(br.readLine());
			
		}
		return st.nextToken();
	}
 
	int nextInt() throws Exception, Exception {
		return Integer.parseInt(nextToken());
	}
 
	long nextLong() throws Exception {
		return Long.parseLong(nextToken());
	}
 
	double nextDouble() throws Exception {
		return Double.parseDouble(nextToken());
	}
}