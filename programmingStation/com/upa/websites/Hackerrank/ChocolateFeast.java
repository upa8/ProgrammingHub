package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class ChocolateFeast extends MyScanner {

	public static void main(String args[]) throws Exception {
		ChocolateFeast in = new ChocolateFeast();
		int t = in.nextInt();
		while (t > 0) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();
			int total = 0;
			int x = n / c;
			System.out.println(x);
			int y = x / m;
			System.out.println(y);
			int z = x % m;
			System.out.println(z);
			total = x + y;
			int nw = z + y;
			int p = 0;
			do {
				p = nw / m;
				int q = nw % m;
				nw = p + q;
				total = total + p;
			} while (p != 0);
			System.out.println(total);
			t--;
		}

	}

}
