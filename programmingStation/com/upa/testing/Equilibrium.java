package com.upa.testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.InputMismatchException;

class TestClass {
	static long[][][] dp = new long[19][163][1460];
	static int[] digit = new int[19];

	public static void main(String[] args) throws Exception {
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long l, r;
		String[] lr;
		initArray();
		for (int i = 0; i < t; i++) {
			lr = br.readLine().split(" ");
			l = Long.parseLong(lr[0]);
			r = Long.parseLong(lr[1]);
			out.printLine(findCountUtil(r) - findCountUtil(l - 1));
		}
		{
			out.close();
		}
	}

	static long findCountUtil(long num) {
		long temp = num;
		int len = 0;
		if (temp == 0) {
			return 0;
		}
		for (len = 0; temp > 0; len++) {
			digit[len] = (int) (temp % 10);
			temp = temp / 10;
		}
		return findCount(len - 1, 0, 0, true);
	}

	static long findCount(int pos, int sum, int sqsum, boolean isMaxDigit) {
		if (pos == -1) {
			return gcd(sum, sqsum) == 1 ? 1 : 0;
		}
		if (!isMaxDigit && (dp[pos][sum][sqsum] != -1)) {
			return dp[pos][sum][sqsum];
		}
		int lastDigit;
		if (isMaxDigit) {
			lastDigit = digit[pos];
		} else {
			lastDigit = 9;
		}
		long ans = 0;
		for (int i = 0; i <= lastDigit; i++) {
			ans += findCount(pos - 1, sum + i, sqsum + (i * i),
					isMaxDigit && (i == lastDigit));
		}
		if (!isMaxDigit) {
			dp[pos][sum][sqsum] = ans;
		}
		return ans;
	}

	static long gcd(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			if ((a % b) == 0) {
				return b;
			}
			return gcd(a % b, b);
		} else {
			if ((b % a) == 0) {
				return a;
			}
			return gcd(a, b % a);
		}
	}

	static void initArray() {
		for (int i = 0; i < 19; i++) {
			for (int j = 0; j < 163; j++) {
				for (int k = 0; k < 1460; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
	}
	/*
	 * USAGE
	 * 
	 * //initialize InputReader in = new InputReader(System.in); OutputWriter
	 * out = new OutputWriter(System.out);
	 * 
	 * //read int int i = in.readInt(); //read string String s =
	 * in.readString(); //read int array of size N int[] x =
	 * IOUtils.readIntArray(in,N); //printline out.printLine("X");
	 * 
	 * 
	 * //flush output out.flush();
	 * 
	 * //remember to close the //outputstream, at the end out.close();
	 * 
	 */

	// FAST IO

	private static class InputReader {
		private final InputStream stream;
		private final byte[] buf = new byte[1024];
		private int curChar;
		private int numChars;
		private SpaceCharFilter filter;

		public InputReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (this.numChars == -1) {
				throw new InputMismatchException();
			}
			if (this.curChar >= this.numChars) {
				this.curChar = 0;
				try {
					this.numChars = this.stream.read(this.buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (this.numChars <= 0) {
					return -1;
				}
			}
			return this.buf[this.curChar++];
		}

		public int readInt() {
			int c = this.read();
			while (this.isSpaceChar(c)) {
				c = this.read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = this.read();
			}
			int res = 0;
			do {
				if ((c < '0') || (c > '9')) {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = this.read();
			} while (!this.isSpaceChar(c));
			return res * sgn;
		}

		public String readString() {
			int c = this.read();
			while (this.isSpaceChar(c)) {
				c = this.read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = this.read();
			} while (!this.isSpaceChar(c));
			return res.toString();
		}

		public double readDouble() {
			int c = this.read();
			while (this.isSpaceChar(c)) {
				c = this.read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = this.read();
			}
			double res = 0;
			while (!this.isSpaceChar(c) && (c != '.')) {
				if ((c == 'e') || (c == 'E')) {
					return res * Math.pow(10, this.readInt());
				}
				if ((c < '0') || (c > '9')) {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = this.read();
			}
			if (c == '.') {
				c = this.read();
				double m = 1;
				while (!this.isSpaceChar(c)) {
					if ((c == 'e') || (c == 'E')) {
						return res * Math.pow(10, this.readInt());
					}
					if ((c < '0') || (c > '9')) {
						throw new InputMismatchException();
					}
					m /= 10;
					res += (c - '0') * m;
					c = this.read();
				}
			}
			return res * sgn;
		}

		public long readLong() {
			int c = this.read();
			while (this.isSpaceChar(c)) {
				c = this.read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = this.read();
			}
			long res = 0;
			do {
				if ((c < '0') || (c > '9')) {
					throw new InputMismatchException();
				}
				res *= 10;
				res += c - '0';
				c = this.read();
			} while (!this.isSpaceChar(c));
			return res * sgn;
		}

		public boolean isSpaceChar(int c) {
			if (this.filter != null) {
				return this.filter.isSpaceChar(c);
			}
			return (c == ' ') || (c == '\n') || (c == '\r') || (c == '\t')
					|| (c == -1);
		}

		public String next() {
			return this.readString();
		}

		public interface SpaceCharFilter {
			public boolean isSpaceChar(int ch);
		}
	}

	private static class OutputWriter {
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) {
			this.writer = new PrintWriter(
					new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer) {
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects) {
			for (int i = 0; i < objects.length; i++) {
				if (i != 0) {
					this.writer.print(' ');
				}
				this.writer.print(objects[i]);
			}
		}

		public void printLine(Object... objects) {
			this.print(objects);
			this.writer.println();
		}

		public void close() {
			this.writer.close();
		}

		public void flush() {
			this.writer.flush();
		}

	}

	private static class IOUtils {

		public static int[] readIntArray(InputReader in, int size) {
			int[] array = new int[size];
			for (int i = 0; i < size; i++) {
				array[i] = in.readInt();
			}
			return array;
		}
	}

}
