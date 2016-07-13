package com.upa.websites.codechef;

public class AdarshAndStipendium extends MyScanner {

	public static void main(String args[]) throws Exception {
		AdarshAndStipendium in = new AdarshAndStipendium();
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			long maxSum = 0;
			boolean passAll = true;
			boolean atleastOneFull = false;
			for (int i = 0; i < n; i++) {
				int x = in.nextInt();
				maxSum += x;
				if (x <= 2) {
					passAll = false;
				}
				if (x >= 5) {
					atleastOneFull = true;
				}
			}
			float x = (float) maxSum / n;
			// System.out.println(x);
			if ((x >= 4.0) && passAll && atleastOneFull) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}
