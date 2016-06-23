package com.upa.websites.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.upa.templates.MyScanner;

public class ProjectEuler3 extends MyScanner {

	public static void main(String args[]) throws Exception {

		ProjectEuler3 in = new ProjectEuler3();
		PrimeNumbers prime = new PrimeNumbers();
		prime.run();
		int t = in.nextInt();
		while (t-- > 0) {
			long n = in.nextLong();
			if (prime.isPrime(n)) {
				System.out.println(n);
			} else {
				System.out.println(prime.largestPrimeFactor(n));
			}
		}
	}
}

class PrimeNumbers {
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

	long largestPrimeFactor(long N) {
		long max = 0;
		int PF_idx = 0;
		long PF = this.primes.get(PF_idx), ans = 0;
		while ((N != 1) && ((PF * PF) <= N)) {
			if ((N % PF) == 0) {
				ans++; // count this pf only once
			}
			while ((N % PF) == 0) {
				N /= PF;
				if (this.isPrime(N)) {
					return N;
				}
			}
			PF = this.primes.get(++PF_idx);
		}
		return PF;
	}

	void run() {
		// first part: the Sieve of Eratosthenes
		this.sieve(10000000); // can go up to 10^7 (need few seconds)
	}

	// public static void main(String[] args) {
	// new PrimeNumbers().run();
	// }
}
