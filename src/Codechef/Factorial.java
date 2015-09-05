package Codechef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Factorial {

		public static void main(String[] args) throws Exception {
			
			MyScanner in = new MyScanner();
			PrintWriter out = new PrintWriter(System.out);
			int t = in.nextInt();
			while (t > 0) {		
				t--;
				out.println(numberOfTrailingZerosOfFactorial(in.nextInt()));
			}
			out.close();
		}
		static long numberOfTrailingZerosOfFactorial(int n) {
			long result = 0;
			long divider = 5;
			double res = n / divider;
			result += (long) res;
			while (res >= 1.0) {
				divider = divider * 5;
				res = n / divider;
				result += (long) res;
			}

			return result;

		}



	
}
class MyScanner {
	BufferedReader br;
	StringTokenizer st;
 
	public MyScanner() {
	
		br = new BufferedReader(new InputStreamReader(System.in));
	
	}
 
	String nextToken() throws Exception {

		while(st == null || !st.hasMoreElements()) {
			
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