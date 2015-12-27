package TrainingUsaco;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MyScanner {
	BufferedReader	br;
	StringTokenizer	st;

	public MyScanner() {
		try {
			this.br = new BufferedReader(new InputStreamReader(System.in));

		} catch ( Exception e ) {
			e.printStackTrace();
		}

	}

	public String nextToken() throws Exception {

		while ( (this.st == null) || !this.st.hasMoreElements() ) {

			this.st = new StringTokenizer(this.br.readLine());

		}
		return this.st.nextToken();
	}

	public int nextInt() throws Exception, Exception {
		return Integer.parseInt(this.nextToken());
	}

	public long nextLong() throws Exception {
		return Long.parseLong(this.nextToken());
	}

	public double nextDouble() throws Exception {
		return Double.parseDouble(this.nextToken());
	}
}
