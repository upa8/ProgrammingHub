package com.upa.websites.hackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonkAndTaskSol2 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String line = br.readLine();
		int numberOfTestCases = Integer.parseInt(line);
		for (int i = 0; i < numberOfTestCases; i++) {
			line = br.readLine();
			int numberOfTasks = Integer.parseInt(line);
			line = br.readLine();
			String[] tasks = line.split(" ");
			System.out.println(performTasks(tasks));
		}
	}

	private static String performTasks(String[] tasks) {
		int maxCount = 0;
		Map<Integer, List<String>> results = new HashMap<>();

		for (String s : tasks) {
			BigInteger val = new BigInteger(s);
			int count = val.bitCount();
			if (count > maxCount) {
				maxCount = count;
			}
			List<String> currentList = results.get(count);
			if (currentList == null) {
				List<String> value = new ArrayList<>();
				value.add(s);
				results.put(count, value);
			} else {
				currentList.add(s);
				results.put(count, currentList);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= maxCount; i++) {
			List<String> currentList = results.get(i);
			if (currentList != null) {
				for (String s : currentList) {
					sb.append(s);
					sb.append(" ");
				}
			}
		}

		return sb.toString();
	}
}