package com.upa.websites.hackerEarth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.upa.templates.MyScanner;

public class ThoughtWorksRhezoPrime extends MyScanner {

	public static void main(String args[]) throws Exception {
		ThoughtWorksRhezoPrime in = new ThoughtWorksRhezoPrime();
		int n = 10;// in.nextInt();
		PrimeNumbers primes = new PrimeNumbers();
		primes.run();
		long a[] = new long[n + 1];
		// System.out.println("a length" + a.length);
		int maxPrime = 0;
		// find max prime

		if ((n == 1) || primes.isPrime(n)) {
			maxPrime = n;
			for (int i = 1; i <= n; i++) {
				int x = 1 + (int) (Math.random() * ((100000 - 1) + 1));
				a[i] = x;// in.nextInt();
				// System.out.print(" " + a[i]);
			}
		} else {
			for (int i = 1; i <= n; i++) {
				a[i] = 1 + (int) (Math.random() * ((100000 - 1) + 1));// in.nextInt();
				// System.out.print(" " + a[i]);
				if (primes.isPrime(i)) {
					maxPrime = i;
				}
			}
		}
		System.out.println();
		for (int i = 1; i <= n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		// System.out.println();

		System.out.println("MaxPrime " + maxPrime);
		// find sum till max prime
		long maxSum = 0;

		for (int i = 1; i <= maxPrime; i++) {
			maxSum = maxSum + a[i];
			System.out.println("maxSum " + maxSum);
			System.out.println("a[] " + a[i]);

		}

		System.out.println("MaxSum " + maxSum);
		// now check the rest
		int index = 1;
		long sum = maxSum;
		for (int i = maxPrime + 1; i <= n; i++) {
			System.out.println("a[" + i + " ] " + a[i]);

			System.out.println("a[" + index + " ] " + a[index]);

			System.out.println("sum" + sum);

			sum = (sum - a[index]) + a[i];
			System.out.println(" a[index] " + a[index] + " a[i]" + a[i]);
			index++;
			System.out.println(" Sum " + sum);
			if (sum > maxSum) {
				maxSum = sum;
			}
			System.out.println("sum " + sum + " maxsum" + maxSum);
		}
		System.out.println(maxSum);

	}

	static class PrimeNumbers {
		int _sieve_size;
		boolean[] bs;
		List<Integer> primes = new ArrayList<Integer>();

		void sieve(int upperbound) {
			this._sieve_size = upperbound + 1;
			this.bs = new boolean[this._sieve_size];
			Arrays.fill(this.bs, true);
			this.bs[0] = this.bs[1] = false;
			for (long i = 2; i < this._sieve_size; i++) {
				if (this.bs[(int) i]) {
					for (long j = i * i; j < this._sieve_size; j += i) {
						this.bs[(int) j] = false;
					}
					this.primes.add((int) i);

				}
			}
		}

		boolean isPrime(long N) {
			if (N < this._sieve_size) {
				return this.bs[(int) N];

			}
			for (int i = 0; i < this.primes.size(); i++) {
				if ((N % this.primes.get(i)) == 0) {
					return false;
				}
			}
			return true; // it takes longer time if N is a large prime!
		}

		void run() {
			// first part: the Sieve of Eratosthenes

			this.sieve(100000); // can go up to 10^6 (need few seconds)

		}
	}

}
