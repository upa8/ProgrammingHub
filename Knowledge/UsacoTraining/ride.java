/*
ID: pratiku2
LANG: JAVA
TASK: ride
*/
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class ride extends MyScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(
		        "ride.out")));
		ride in = new ride();
		
				String a = in.nextToken();
		String b = in.nextToken();
		int lengthOfStringA = a.length();
		int lengthOfStringB = b.length();
		long stringAProduct = 1;
		long stringBProduct = 1;
		for ( int i = 0 ; i < lengthOfStringA ; i++ ) {
			stringAProduct *= (a.charAt(i) - 64);
		}
		for ( int i = 0 ; i < lengthOfStringB ; i++ ) {
			stringBProduct *= (b.charAt(i) - 64);
		}
		long groupA = stringAProduct % 47;
		long groupB = stringBProduct % 47;

		if (groupA == groupB) {
			//System.out.println("GO");
			out.println("GO");
		} else {
			out.println("STAY");
		}

    	out.close();        
	}
}

class MyScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public MyScanner() {
		try{
				br = new BufferedReader(new FileReader("ride.in"));
		
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
