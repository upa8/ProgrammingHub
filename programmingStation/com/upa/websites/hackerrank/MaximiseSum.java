package com.upa.websites.hackerrank;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.upa.templates.MyScanner;

public class MaximiseSum extends MyScanner {
	static long min = 0;

	public static void main(String args[]) throws Exception {
		MaximiseSum in = new MaximiseSum();
		long t = in.nextLong();
		while (t > 0) {
			long n = in.nextLong();
			long m = in.nextLong();
			HashMap<Long, Long> hm = new HashMap<Long, Long>();
			for (long i = 0; i < n; i++) {
				hm.put(i + 1, in.nextLong());
			}
			Map<Long, Long> sortedMapAsc = sortByComparator(hm, true);

			Set set = hm.entrySet();
			Iterator i = set.iterator();
			long firstKey = 0;
			long firstValue = 0;
			while (i.hasNext()) {
				Map.Entry me = (Map.Entry) i.next();
				long secondKey = (long) me.getKey();
				long secondValue = (long) me.getValue();
				if (firstKey > secondValue) {
					if ((secondKey - firstKey) < min) {
						min = secondKey - firstKey;
					}

				}
				if (i.hasNext()) {
					Map.Entry me2 = (Map.Entry) i.next();
					firstKey = (long) me2.getKey();
					firstValue = (long) me2.getValue();
				}
			}
			System.out.println(min);
			t--;
		}
	}

	private static Map<Long, Long> sortByComparator(Map<Long, Long> unsortMap,
			final boolean order) {

		List<Entry<Long, Long>> list = new LinkedList<Entry<Long, Long>>(
				unsortMap.entrySet());

		// Sorting the list based on values
		Collections.sort(list, new Comparator<Entry<Long, Long>>() {
			@Override
			public int compare(Entry<Long, Long> o1, Entry<Long, Long> o2) {
				if (order) {
					return o1.getValue().compareTo(o2.getValue());
				} else {
					return o2.getValue().compareTo(o1.getValue());

				}
			}
		});

		// Maintaining insertion order with the help of LinkedList
		Map<Long, Long> sortedMap = new LinkedHashMap<Long, Long>();
		for (Entry<Long, Long> entry : list) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

		return sortedMap;
	}

}
