package com.upa.java.builtInDS;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String args[]) {
		// Create a hash map
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// Put elements to the map
		hm.put(1, 2);
		hm.put(2, 2);
		hm.put(4, 4);
		hm.put(3, 3);
		hm.put(5, 1);
		System.out.println(hm.get(5));

		/*
		 * Set set = hm.entrySet();
		 *
		 * Iterator i = set.iterator();
		 *
		 * while(i.hasNext()) { Map.Entry me = (Map.Entry)i.next(); int a =
		 * (int) me.getValue(); System.out.print(me.getKey() + ": ");
		 * System.out.println(me.getValue()); } // Get a set of the entries
		 * //Set set = hm.entrySet(); // Get an iterator //Iterator i =
		 * set.iterator(); // Display elements // while(i.hasNext()) { //
		 * Map.Entry me = (Map.Entry)i.next();
		 *
		 * // System.out.print(me.getKey() + ": "); //
		 * System.out.println(me.getValue()); // } System.out.println(hm);
		 * Set<Entry<Integer, Integer>> set = hm.entrySet();
		 *
		 * List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer,
		 * Integer>>(set);
		 *
		 * Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
		 * { public int compare( Map.Entry<Integer, Integer> o1,
		 * Map.Entry<Integer, Integer> o2 ) { return (o1.getValue()).compareTo(
		 * o2.getValue() ); } } );
		 *
		 *
		 * for(Map.Entry<Integer, Integer> entry:list){
		 * System.out.println(entry.getKey()+" ==== "+entry.getValue());
		 *
		 * }
		 *
		 *
		 *
		 *
		 * // Deposit 1000 into Zara's account //double balance =
		 * ((Double)hm.get("Zara")).doubleValue(); // hm.put("Zara", new
		 * Double(balance + 1000)); // System.out.println("Zara's new balance: "
		 * + // hm.get("Zara")); }
		 */
	}
}