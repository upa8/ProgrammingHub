package com.upa.websites.Codechef;

public class SimpleSum extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SimpleSum in = new SimpleSum();
		long t = in.nextLong();
		while ( t > 0 ) {
			long n = in.nextLong();
			long sum = 0;
			// Check if n i prime or not ,
			// If it is prime number then it will have only two factors
			// 1 and the number itself .

			for ( long i = 1 ; i <= n ; i++ ) {
				System.out.println("i " + i + " n " + n + " gcd (i,n) "
				        + findGCD(i, n));
				// System.out.println("i " + i + " n " + n + " gcd (i,n) "
				// + gcd(i, n));

				if ((n % i) == 0) {
					sum = sum + (n / i);
				} else {
					// sum = sum + (n / (gcd(i, n)));
					sum = sum + (n / (findGCD(i, n)));

				}

			}
			System.out.println(sum);
			t--;
		}
	}

	private static long findGCD(long number1, long number2) {
		/*
		 * // base case if (number2 == 0) { return number1; } return
		 * findGCD(number2, number1 % number2);
		 */
		long t;
		while ( number2 != 0 ) {
			t = number2;
			number2 = number1 % number2;
			number1 = t;
		}
		return number1;

	}

	/*
	 * public static long gcd(long u, long v) { long t, k;
	 * 
	 * if (v == 0) { return u; }
	 * 
	 * u = Math.abs(u); v = Math.abs(v); if (u < v) { t = u; u = v; v = t; }
	 * 
	 * for ( k = 1 ; ((u & 1) == 0) && ((v & 1) == 0) ; k <<= 1 ) { u >>= 1; v
	 * >>= 1; }
	 * 
	 * t = (u & 1) != 0 ? -v : u; while ( t != 0 ) { while ( (t & 1) == 0 ) { t
	 * >>= 1; }
	 * 
	 * if (t > 0) { u = t; } else { v = -t; }
	 * 
	 * t = u - v; } return u * k; }
	 */
	/*
	 * public static long gcd(long p, long q) { if (q == 0) { return p; } if (p
	 * == 0) { return q; }
	 * 
	 * // p and q even if (((p & 1) == 0) && ((q & 1) == 0)) { return gcd(p >>
	 * 1, q >> 1) << 1; } else if ((p & 1) == 0) { return gcd(p >> 1, q); } else
	 * if ((q & 1) == 0) { return gcd(p, q >> 1); } else if (p >= q) { return
	 * gcd((p - q) >> 1, q); } else { return gcd(p, (q - p) >> 1); } }
	 */

}

/*
 *
 *
 * C++ Implementation // Jun 24 2015, minsu( github : https://github.com/minsuu/
 * ) #include <bits/stdc++.h> using namespace std; const int MAXN = 1111111; int
 * sieve[MAXN], phi[MAXN]; long long phisum[MAXN]; int main(){ for(int i=2;
 * (i*i)<this.MAXN; i++){ if( sieve[i] != 0 ) {
	continue;
} for(int j=i; j<this.MAXN; j+=i)
 * sieve[j] = i; } phi[1] = 1; // phi(x^p) = (x-1)*x^(p-1) :
 * http://oeis.org/A000010 for(int i=2; i<MAXN; i++){ if( sieve[i] == 0 ) phi[i]
 * = i-1, sieve[i] = i; else{ int x = sieve[i], j = i/x, p = 1; while( j%x == 0
 * ) j/=x, p*=x; phi[i] = phi[j] * (x-1) * p; } } // phisum(x) = sum{d|n}
 * d*phi(d) : http://oeis.org/A057660 for(int i=1; i<MAXN; i++) for(int j=i;
 * j<MAXN; j+=i) phisum[j] += i * 1LL * phi[i]; int N=0,T; scanf("%d",&T); //
 * sum{k=1..n} LCM(n,k) = n*(1+phisum(n))/2 : http://oeis.org/A051193
 * while(T--){ scanf("%d",&N); printf("%lld\n", N*(1+phisum[N])/2 ); } return 0;
 * }
 * 
 */