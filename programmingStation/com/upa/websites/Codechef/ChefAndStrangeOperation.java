package com.upa.websites.codechef;

public class ChefAndStrangeOperation extends MyScanner {

	public static void main(String args[]) throws Exception {

		ChefAndStrangeOperation in = new ChefAndStrangeOperation();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int x = in.nextInt() - 1;
			long m = in.nextLong();
			long a[] = new long[n];
			a[0] = in.nextLong();

			for (int i = 1; i < n; i++) {
				a[i] = in.nextLong();
			}

			long sum = 0;

			if (x == 0) {

				System.out.println(a[0]);

			} else {
				for (int i = 1; i <= x; i++) {
					sum = ((m * a[i - 1]) + a[i]) % 1000000007;
					System.out.print(a[i - 1] + " ");
				}
			}
			System.out.print(a[n - 1] + " ");
			System.out.println();
			System.out.println(sum);
		}
	}
}
