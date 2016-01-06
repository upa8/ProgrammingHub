package com.upa.codebook.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

//utilizing Java "Generics"
class pair<X, Y> {
	X _first;
	Y _second;

	public pair(X f, Y s) {
		this._first = f;
		this._second = s;
	}

	X first() {
		return this._first;
	}

	Y second() {
		return this._second;
	}

	void setFirst(X f) {
		this._first = f;
	}

	void setSecond(Y s) {
		this._second = s;
	}
}

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// Introducing pair
		PriorityQueue<pair<Integer, String>> pq = new PriorityQueue<pair<Integer, String>>(
				1, new Comparator<pair<Integer, String>>() {
					@Override
					public int compare(pair<Integer, String> i,
							pair<Integer, String> j) {
						// Currently Max heap , reverse this j and i
						// to obtain Min Heap
						return j.first() - i.first();
					}
				});

		// suppose we enter these 7 money-name pairs below
		/*
		 * 100 john 10 billy 20 andy 100 steven 70 felix 2000 grace 70 martin
		 */
		// Inserting a pair in o(log n)
		pq.offer(new pair<Integer, String>(100, "john"));
		pq.offer(new pair<Integer, String>(10, "billy"));
		pq.offer(new pair<Integer, String>(20, "andy"));
		pq.offer(new pair<Integer, String>(100, "steven"));
		pq.offer(new pair<Integer, String>(70, "felix"));
		pq.offer(new pair<Integer, String>(2000, "grace"));
		pq.offer(new pair<Integer, String>(70, "martin"));

		// this is how we use Java PriorityQueue
		// priority queue will arrange items in 'heap' based
		// on the first key in pair, which is money (integer), largest first
		// if first keys tied, use second key, which is name, largest first

		// the internal content of pq heap MAY be something like this:
		// re-read (max) heap concept if you do not understand this diagram
		// the primary keys are money (integer), secondary keys are names
		// (string)!
		// (2000,grace)
		// (100,steven) (70,martin)
		// (100,john) (10,billy) (20,andy) (70,felix)

		// let's print out the top 3 person with most money
		pq.add(new pair<Integer, String>(3000, "Upa"));
		// O(1) to access the top / max element + O(log n) removal of the top
		// and repair the structure
		pair<Integer, String> result = pq.poll();
		System.out.println(result.second() + " has " + result.first() + " $");
		result = pq.poll();
		System.out.println(result.second() + " has " + result.first() + " $");
		result = pq.poll();
		System.out.println(result.second() + " has " + result.first() + " $");
	}
}
