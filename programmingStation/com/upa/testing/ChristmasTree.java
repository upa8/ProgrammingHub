package com.upa.testing;

import com.upa.templates.MyScanner;

public class ChristmasTree extends MyScanner {

	public static void main(String args[]) throws Exception {
		ChristmasTree in = new ChristmasTree();
		int n = in.nextInt();
		System.out.println(in.sol(n));
	}

	public String sol(int n) {

		StringBuilder ans = new StringBuilder();
		if (n <= 1) {
			ans.append("You cannot generate christmas tree");
			return ans.toString();

		}
		if (n > 20) {
			System.out.println("Tree is no more");
			ans.append("Tree is no more");
			return ans.toString();
		}

		// rest logic here
		// parts are less 1 than number of days
		for (int i = 0; i < (n - 1); i++) {
			if (i == 0) {
				ans.append("*");
				for (int j = 0; j < (n + 1); j++) {
					String s = ans.toString();
					StringBuilder newString = new StringBuilder(s);
					newString.append(" *");
					newString.append(" *");
				}
			}
		}
		return null;

	}
}
