package com.upa.java.builtInDS;

import java.util.Map.Entry;
import java.util.TreeMap;

class Dogs implements Comparable<Dogs> {
	String color;
	int size;

	Dogs(String c, int s) {
		this.color = c;
		this.size = s;
	}

	@Override
	public String toString() {
		return this.color + " dog";
	}

	@Override
	public int compareTo(Dogs o) {
		// System.out.println(o.size + " " + this.size);
		// System.out.println(o.size - this.size);
		return o.size - this.size;
	}
}

public class TreeMapDemo {
	public static void main(String[] args) {
		Dogs d1 = new Dogs("red", 30);
		Dogs d2 = new Dogs("black", 20);
		Dogs d3 = new Dogs("white", 10);
		Dogs d4 = new Dogs("nothing", 40);

		TreeMap<Dogs, Integer> treeMap = new TreeMap<Dogs, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);

		for (Entry<Dogs, Integer> entry : treeMap.entrySet()) {
			Dogs dg = entry.getKey();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}