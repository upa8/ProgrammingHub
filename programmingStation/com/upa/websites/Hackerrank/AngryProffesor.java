package com.upa.websites.Hackerrank;

import com.upa.templates.MyScanner;

public class AngryProffesor extends MyScanner {

	public static void main(String[] args) throws Exception {
		MyScanner in = new MyScanner();
		int tc = in.nextInt();
		for (int c = 0; c < tc; c++) {

			int N = Integer.parseInt(in.nextToken());
			int K = Integer.parseInt(in.nextToken());

			int count = 0;
			for (int i = 0; i < N; i++) {
				int m = Integer.parseInt(in.nextToken());
				if ((m < 0) || (m == 0)) {
					count++;
				}
			}
			if ((count == K) || (count > K)) {
				System.out.println("NO");
			} else {

				System.out.println("YES");
			}
		}
	}
}
