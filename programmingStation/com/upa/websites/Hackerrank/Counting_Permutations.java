package com.upa.websites.Hackerrank;

import java.util.*;
import java.io.*;

class Counting_Permutations  extends MyScanner{
	static final int MOD = 1000000007;
	static Node[] tree;
    static boolean[] dup;
	static long[] F;
	public static void main (String[] args) throws Exception {
		Counting_Permutations in = new Counting_Permutations();
		F = new long[100001];
		F[0] = 1;
		for (int i = 1; i <= 100000; i++) {
			F[i] = F[i-1]*i % MOD;
		}
		
		int t = in.nextInt();
		for (int qq = 0; qq < t; qq++) {
			int n = in.nextInt();
			tree = new Node[n];
			dup = new boolean[n];
			for (int i = 0; i < n; i++)
				tree[i] = new Node();
			for (int i = 0; i < n - 1; i++) {
				int a = Integer.parseInt(in.nextToken())-1;
				int b = Integer.parseInt(in.nextToken())-1;
				tree[a].child.add(b);
				tree[b].child.add(a);
			}
			for (int i = 0; i < n; i++)
				if (tree[i].child.size() <= 2)
					compute(i, -1);
			for (int i = 0; i < n; i++)
				if (tree[i].child.size() <= 2)
					dp(i, -1);
			HashSet<String> v = new HashSet<String>();
			long ans = 0;
			for (int i = 0; i < n; i++) {
				if (tree[i].child.size() <= 2 && !v.contains(tree[i].hash.get(-1).toString())) {
					ans = (ans + tree[i].dp.get(-1))%MOD;
					v.add(tree[i].hash.get(-1).toString());
				}
			}
		System.out.println(ans);
		}
		
		
	}
	private static long choose (int n, int k) {
		return divMod(divMod(F[n], F[k]), F[n-k]);
	}
	private static long divMod (long i, long j) {
		return i * pow(j, MOD-2)%MOD;
	}
	private static long pow (long a, int b) {
		if (b == 0)
			return 1;
		if (b == 1)
			return a;
		if (b % 2 == 0)
			return pow(a*a % MOD, b/2);
		return a*pow(a*a % MOD, b/2)%MOD;
	}
	private static void dp (int i, int prev) {
		if (tree[i].dp.containsKey(prev))
			return;
		ArrayList<Integer> dpv = new ArrayList<Integer>();
		for (int j : tree[i].child) {
			if (j != prev) {
				dp(j, i);
				dpv.add(j);
			}
		}
		if (dpv.size() == 0)
			tree[i].dp.put(prev, 1l);
		else if (dpv.size() == 1)
			tree[i].dp.put(prev, 2*tree[dpv.get(0)].dp.get(i) % MOD);
		else if (dpv.size() == 2) {
			int a = tree[dpv.get(0)].size.get(i);
			int b = tree[dpv.get(1)].size.get(i);
			long dpa = tree[dpv.get(0)].dp.get(i);
			long dpb = tree[dpv.get(1)].dp.get(i);
			long pow = tree[dpv.get(0)].hash.get(i).toString().equals(tree[dpv.get(1)].hash.get(i).toString()) ? 1 : 2;
			tree[i].dp.put(prev, (((choose(a+b, a) * dpa)%MOD * dpb)%MOD * pow) % MOD);
		}
			
	}
private static void compute (int i, int prev) {
	if (tree[i].hash.containsKey(prev))
		return;
		int size = 1;
		ArrayList<StringBuilder> hv = new ArrayList<StringBuilder>();
		for (int j : tree[i].child)
			if (j != prev) {
				compute(j, i);
				size += tree[j].size.get(i);
				hv.add(tree[j].hash.get(i));
			}
		tree[i].size.put(prev, size);
		if (hv.size() == 0)
			tree[i].hash.put(prev, new StringBuilder());
		else if (hv.size() == 2) {
			if (hv.get(0).toString().compareTo(hv.get(1).toString()) < 0) {
				tree[i].hash.put(prev, new StringBuilder());
				tree[i].hash.get(prev).append("0");
				tree[i].hash.get(prev).append(hv.get(0));
				tree[i].hash.get(prev).append("21");
				tree[i].hash.get(prev).append(hv.get(1));
				tree[i].hash.get(prev).append("2");
			}
			else {
				tree[i].hash.put(prev, new StringBuilder());
				tree[i].hash.get(prev).append("0");
				tree[i].hash.get(prev).append(hv.get(1));
				tree[i].hash.get(prev).append("21");
				tree[i].hash.get(prev).append(hv.get(0));
				tree[i].hash.get(prev).append("2");
			}
		} else {
			tree[i].hash.put(prev, new StringBuilder());
			tree[i].hash.get(prev).append("0");
			tree[i].hash.get(prev).append(hv.get(0));
			tree[i].hash.get(prev).append("2");
		}
	}

	static class Node {
		ArrayList<Integer> child;
		HashMap<Integer, Long> dp;
		HashMap<Integer, StringBuilder> hash;
		HashMap<Integer, Integer> size;
		Node () {
			child = new ArrayList<Integer>();
			dp = new HashMap<Integer, Long>();
			hash = new HashMap<Integer, StringBuilder>();
			size = new HashMap<Integer, Integer>();
		}
	}
	

}