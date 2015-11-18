/*
ID: pratiku2
LANG: JAVA
TASK: test
*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class test extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
		        "test.out")));
		test in = new test();
		int a = in.nextInt();
		int b = in.nextInt();
		out.println(a+b);
    	out.close();        
	}
}

class MyScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public MyScanner() {
		try{
				br = new BufferedReader(new FileReader("test.in"));
	
			} catch ( Exception e ) {
			e.printStackTrace();
		}
			
	}
 
	public String nextToken() throws Exception {

		while(st == null || !st.hasMoreElements()) {
			
			  st = new StringTokenizer(br.readLine());
			
		}
		return st.nextToken();
	}
 
	public int nextInt() throws Exception{
		return Integer.parseInt(nextToken());
	}
 
	public long nextLong() throws Exception {
		return Long.parseLong(nextToken());
	}
 
	public double nextDouble() throws Exception {
		return Double.parseDouble(nextToken());
	}



}
