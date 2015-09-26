package Testing;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class Solution extends MyScanner{
	public static void main(String args[]) throws Exception{
		Solution in = new Solution();
		int t = in.nextInt();
		while(t>0){
			
			t--;
		}


	}
	
}
class MyScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public MyScanner() {
	
		br = new BufferedReader(new InputStreamReader(System.in));
	
	}
 
	public String nextToken() throws Exception {

		while(st == null || !st.hasMoreElements()) {
			
			  st = new StringTokenizer(br.readLine());
			
		}
		return st.nextToken();
	}
 
	public int nextInt() throws Exception, Exception {
		return Integer.parseInt(nextToken());
	}
 
	public long nextLong() throws Exception {
		return Long.parseLong(nextToken());
	}
 
	public double nextDouble() throws Exception {
		return Double.parseDouble(nextToken());
	}
}
