package Testing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import com.upa.websites.Hackerrank.MyScanner;

public class Pattern extends MyScanner{
	public static void main(String args[]) throws Exception{
		Pattern in = new Pattern();
		int lines = in.nextInt();
		int count =  1;
		int part  = (lines - 1) /2;
		for(int i = 0 ; i <lines ; i++){
			for(int j = part ; j>0 ; j--){
				
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

}

