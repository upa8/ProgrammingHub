package com.upa.websites.codechef;

public class ChefAndStrangeOperation extends MyScanner {

	static final long modularNum = ((long) 1e9) + 7;

	public static void main(String[] args) throws Exception {

		ChefAndStrangeOperation in = new ChefAndStrangeOperation();
		int t = in.nextInt();
		while (t-- > 0) {
			int N = in.nextInt();
			int x = in.nextInt();
			long M = in.nextLong();
			long[] givenArr = new long[N];
			for (int i = 0; i < N; i++) {
				givenArr[i] = in.nextLong();
			}
			long multiCoeffFactor = 1L;
			long finalAnswer = 0L;
			for (long k = -1; k <= (x - 2); k++) {
				if (k == -1) {
					finalAnswer = givenArr[x - 2 - (int) (k)];
				} else {
					long numberator = M + k;
					long denominator = k + 1L;
					multiCoeffFactor = multiplication(
							multiplication(multiCoeffFactor, numberator),
							reverseModulo(denominator));
					finalAnswer = additionOfModule(finalAnswer, multiplication(
							givenArr[x - 2 - (int) (k)], multiCoeffFactor));
				}
			}
			System.out.println(finalAnswer % modularNum);
		}
	}

	public static long multiplication(long m, long n) {
		return ((m % modularNum) * (n % modularNum)) % modularNum;
	}

	public static long additionOfModule(long a, long b) {
		return ((a % modularNum) + (b % modularNum)) % modularNum;
	}

	public static long modPow(long x, long y) {
		if ((y == 0L) || (x == 1L)) {
			return 1L;
		} else if (y == 1L) {
			return x;
		} else {
			if ((y & 1L) == 0L) {
				return modPow((x * x) % modularNum, y / 2L);
			} else {
				return (x * modPow((x * x) % modularNum, ((y - 1L) / 2L)))
						% modularNum;
			}
		}
	}

	public static long reverseModulo(long n) {
		return modPow(n, modularNum - 2L);
	}
}