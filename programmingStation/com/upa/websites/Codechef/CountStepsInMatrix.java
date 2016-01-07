package com.upa.websites.Codechef;

import java.util.HashMap;

import com.upa.templates.MyScanner;

public class CountStepsInMatrix extends MyScanner {
	public static void main(String args[]) throws Exception {
		CountStepsInMatrix in = new CountStepsInMatrix();
		int t = in.nextInt();
		int x = -1;
		int y = -1;
		while (t > 0) {
			int n = in.nextInt();
			HashMap<Integer, Cordinates> hm = new HashMap<Integer, Cordinates>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Cordinates c = new Cordinates(i + 1, j + 1);
					int a = Integer.parseInt(in.nextToken());
					hm.put(a, c);
					// Cordinates m = hm.get(a);
					// System.out.println(m.GetX() +" " + m.GetY());
				}
			}

			int count = 0;
			int currx = -1;
			int curry = -1;
			for (int i = 0; i < (n * n); i++) {
				Cordinates m = hm.get(i + 1);
				x = m.GetX();
				y = m.GetY();
				if (i == 0) {
					currx = x;
					curry = y;
				} else {
					count += Math.abs(currx - x);

					count += Math.abs(curry - y);
					currx = x;
					curry = y;
				}

			}
			System.out.println(count);
			t--;
		}

	}
}

class Cordinates {
	public int x;
	public int y;

	Cordinates(int a, int b) {
		// TODO Auto-generated constructor stub
		this.x = a;
		this.y = b;
	}

	public int GetX() {
		return this.x;
	}

	public int GetY() {
		return this.y;
	}

}