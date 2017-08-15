package com.upa.websites.hackerEarth;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MonkAndMatchMaking3 {
	public static void main(String args[]) throws Exception {

		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(
				new OutputStreamWriter(System.out));

		char[] str = in.readLine().toCharArray();

		int[] prefixSum = new int[str.length + 1];

		prefixSum[0] = 0;

		for (int i = 1; i <= str.length; i++) {
			prefixSum[i] = prefixSum[i - 1] + str[i - 1];
		}

		int Q = Integer.parseInt(in.readLine());
		while (Q-- > 0) {
			String[] inputs = in.readLine().split(" ");
			int L1 = Integer.parseInt(inputs[0]);
			int R1 = Integer.parseInt(inputs[1]);
			int L2 = Integer.parseInt(inputs[2]);
			int R2 = Integer.parseInt(inputs[3]);

			// L1--;L2--;R1--;R2--;
			if ((R1 - L1) != (R2 - L2)) {
				out.write("No\n");
			} else if ((prefixSum[R1] - prefixSum[L1 - 1]) != (prefixSum[R2]
					- prefixSum[L2 - 1])) {
				out.write("No\n");
			} else if ((prefixSum[R1]
					- prefixSum[(L1 + ((R1 - L1) / 2)) - 1]) != (prefixSum[R2]
							- prefixSum[(L2 + ((R2 - L2) / 2)) - 1])) {
				out.write("No\n");
			} else {
				out.write("Yes\n");
			}

			out.flush();
		}
		in.close();
		out.close();

	}
}