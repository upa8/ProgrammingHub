package com.upa.websites.hackerrank;

import com.upa.templates.MyScanner;

public class Kangaroo extends MyScanner {

	public static void main(String args[]) throws Exception {
		Kangaroo in = new Kangaroo();
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		System.out.println(in.solution(x1, v1, x2, v2));
	}

	public String solution(int x1, int v1, int x2, int v2) {
		// TODO Auto-generated method stub
		String result = "NO";
		if (x1 == x2) {
			if (v1 == v2) {
				result = "YES";
			}
		} else {
			if ((x1 < x2)) {
				if ((v1 > v2) && (v1 != v2)) {
					int m = Math.abs(x1 - x2);
					int n = Math.abs(v2 - v1);
					int z = m % n;
					if (z == 0) {
						result = "YES";
					}

				} else {
					result = "NO";
				}

			} else {
				if ((x2 < x1)) {
					if ((v2 > v2) && (v2 != v1)) {
						// result = "YES";
						int m = Math.abs(x1 - x2);
						int n = Math.abs(v2 - v1);
						int z = m % n;
						if (z == 0) {
							result = "YES";
						}
					} else {
						result = "NO";
					}

				}
			}
		}

		return result.toString();
	}
}
