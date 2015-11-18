package Testing;

public class Test extends MyScanner {
	public static void main(String args[]) throws Exception {
		Test in = new Test();
		long MAX = 1000007;
		long sieve[] = new long[(int) MAX];
		long phi[] = new long[(int) MAX];
		long phisum[] = new long[(int) MAX];
		int t = in.nextInt();
		// for sieve array 
		for ( long i = 2 ; (i * i) < MAX ; i++ ) {
			if (sieve[(int) i] != 0) {
				continue;
			}
			for ( long j = i ; j < MAX ; j += i ) {
				sieve[(int) j] = i;
			}
		}
		phi[1] = 1;
		// phi(x^p) = (x-1)*x^(p-1) : http://oeis.org/A000010

		for ( long i = 2 ; i < MAX ; i++ ) {
			if (sieve[(int) i] == 0) {
				phi[(int) i] = i - 1;
				sieve[(int) i] = i;
			} else {
				long x = (int) sieve[(int) i], j = i / x, p = 1;
				while ( (j % x) == 0 ) {
					j /= x;
				}
				p *= x;
				phi[(int) i] = phi[(int) j] * (x - 1) * p;
			}
		}

		// phisum(x) = sum{d|n} d*phi(d) : http://oeis.org/A057660
		for ( long i = 1 ; i < MAX ; i++ ) {
			for ( long j = i ; j < MAX ; j += i ) {
				phisum[(int) j] += (i * phi[(int) i]) >> 1;
			}
		}

		while ( t > 0 ) {
			long n = in.nextLong();
			System.out.println(phisum[(int) n] / Integer.MAX_VALUE);
			t--;
		}
	}
}