package com.upa.websites.hackerrank;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

import com.upa.templates.MyScanner;

public class DemandingMoney extends MyScanner {
	public static void main(String[] args) throws Exception {
		DemandingMoney in = new DemandingMoney();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] c = new int[n + 1];
		boolean[][] graph = new boolean[n + 1][n + 1];
		int a, b;
		for (int i = 1; i <= n; i++) {
			c[i] = in.nextInt();
		}
		for (int i = 0; i < m; i++) {
			a = in.nextInt();
			b = in.nextInt();
			graph[a][b] = true;
			graph[b][a] = true;
		}
		System.out.println(in.sol(n, m, c, graph));
	}

	private String sol(int n, int m, int[] c, boolean[][] graph) {
		// TODO Auto-generated method stub
		long max = (long) (Math.pow(2, n) - 1);
		long maxMoney = 0;
		long maxCnt = 0;
		Set<Long> resultSet = new HashSet<>();
		for (long i = 1; i < max; i++) {
			BitSet bit = new BitSet(n);
			long totalMoney = 0;
			long x = i;
			int index = 1;
			int cnt = 0;
			long result = 0;
			while (x > 0) {
				if (((x % 2) == 1) && !bit.get(index)) {
					result += Math.pow(2, index);
					totalMoney += c[index];
					bit.set(index);
					cnt++;
					for (int k = 1; k <= n; k++) {
						if (graph[index][k] & !bit.get(k)) {
							bit.set(k);
							cnt++;
						}
					}
				}
				x = x >> 1;
				index++;
			}
			if (totalMoney > maxMoney) {
				maxMoney = totalMoney;
				resultSet.clear();
				resultSet.add(result);
			} else if (totalMoney == maxMoney) {
				resultSet.add(result);
			}
		}
		StringBuilder str = new StringBuilder();
		str.append(maxMoney + " " + resultSet.size());
		// System.out.println(maxMoney + " " + resultSet.size());

		return str.toString();
	}
}