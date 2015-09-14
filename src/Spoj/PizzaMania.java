package Spoj;

/*
 * Author : Pratik Upacharya
 * Question : http://www.spoj.com/problems/OPCPIZZA/
 * 
 */


import java.util.HashMap;

import Hackerrank.MyScanner;

public class PizzaMania extends MyScanner {
	
	public static void main(String args[]) throws Exception{
		PizzaMania in = new PizzaMania();
		int t = in.nextInt();
		while(t>0){
			int n = Integer.parseInt(in.nextToken());
			int m = Integer.parseInt(in.nextToken());
			HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
			int count = 0 ; 
			while(n>0){
				int a = Integer.parseInt(in.nextToken());
				int x  = m - a ;
				if(hm.containsKey(x)){
					count++;
				}
				hm.put(a, a);
				n--;
			}
			System.out.println(count);
			t--;
		}
		
	}
}


/*
*
*Another solution with different logic and different time complexity 
*
*import java.io.*;
import java.util.*;

 class opcpizza {
	private static Reader in;
	private static PrintWriter out;

	public static void main(String[] args) throws IOException {
		in = new Reader();
		out = new PrintWriter(System.out, true);
		
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt(), M = in.nextInt();
			int [] arr = new int [N];
			for (int i = 0; i < N; i++)
				arr [i] = in.nextInt();
			Arrays.sort(arr);
			int front = 0, back = N - 1, count = 0;
			while (front < back) {
				if (arr [front] + arr [back] == M) {
					count++;
					front++;
					back--;
				} else if (arr [front] + arr [back] > M) {
					back--;
				} else {
					front++;
				}
			}
			
			out.println(count);
		}
		out.close();
		System.exit(0);
	}

	static class Reader {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public Reader() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public Reader(String file_name) throws IOException {
			din = new DataInputStream(new FileInputStream(file_name));
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String readLine() throws IOException {
			byte[] buf = new byte[1024];
			int cnt = 0, c;
			while ((c = read()) != -1) {
				if (c == '\n')
					break;
				buf[cnt++] = (byte) c;
			}
			return new String(buf, 0, cnt);
		}

		public int nextInt() throws IOException {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long nextLong() throws IOException {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public double nextDouble() throws IOException {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do {
				ret = ret * 10 + c - '0';
			} while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() throws IOException {
			if (bufferPointer == bytesRead)
				fillBuffer();
			return buffer[bufferPointer++];
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}

*/