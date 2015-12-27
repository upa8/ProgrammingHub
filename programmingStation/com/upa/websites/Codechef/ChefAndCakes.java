package com.upa.websites.Codechef;

public class ChefAndCakes extends MyScanner {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChefAndCakes in = new ChefAndCakes();
		int t = in.nextInt();
		while ( t > 0 ) {
			long n = in.nextLong();
			long m = in.nextLong();
			if (n == 1) {
				System.out.println("Yes");

			} else {
				if (m == 0) {
					System.out.println("No 1");
				} else {
					long getGcd = findGCD(n, m);
					if (getGcd == 1) {
						System.out.println("Yes");
					} else {
						System.out.println("No " + (n / getGcd));
					}
				}
			}

			/*
			boolean flag = true;
			// Count total robots having the cake
			long count = 1;
			long a[] = new long[(int) (n + 1)];
			Arrays.fill(a, 0);
			long pos = m + 1;
			long x = 0;
			a[(int) pos] = 1;

			while ( flag ) {
				x = m + pos;
				if ((x > n) && (x != n)) {
					x = Math.abs(x - n);
					if (a[(int) x] == 1) {
						break;
					}
					pos = x;
				} else {
					if (x < n) {
						if (a[(int) x] == 1) {
							break;
						}
						pos = x;
					} else {
						if (x == n) {
							if (a[(int) x] == 1) {
								break;
							}
							pos = x;
						}
					}
				}
				count++;
			}
			*/
			/*
			 * // Create hashmap
			 * 
			 * HashMap<Long,Long> hm = new HashMap<Long,Long>(); for ( long i =
			 * 1 ; i <= n ; i++ ) { hm.put(i, (long) 0); } //
			 * System.out.println("Start"); // System.out.println(hm); long pos
			 * = m + 1; hm.put(pos, (long) 1); long x = 0;
			 * 
			 * // // System.out.println("First change"); //
			 * System.out.println(hm); while ( flag ) { //
			 * System.out.println("In Loop"); // System.out.println(hm); x = m +
			 * pos; // System.out.println("X " + x); if ((x > n) && (x != n)) {
			 * x = Math.abs(x - n); if (hm.get(x) == 1) { break; } hm.put(x,
			 * (long) 1); pos = x; } else { if (x < n) { if (hm.get(x) == 1) {
			 * break; } hm.put(x, (long) 1); pos = x; } else { if (x == n) { if
			 * (hm.get(x) == 1) { break; } hm.put(x, (long) 1); pos = x; } } }
			 * count++; }
			 */
			// System.out.println(hm);
			/*
			if (count == n) {
				System.out.println("Yes");

			} else {
				System.out.println("No " + count);
			}
			*/
			// }
			// }
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
}
