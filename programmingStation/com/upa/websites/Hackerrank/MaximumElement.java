package com.upa.websites.Hackerrank;
/*
 * Question :

 * 		https://www.hackerrank.com/challenges/maximum-element
 */

import java.util.Iterator;
import java.util.LinkedList;

import com.upa.templates.MyScanner;

public class MaximumElement extends MyScanner {

	public static void main(String[] args) throws Exception {

		MaximumElement in = new MaximumElement();
		long n = in.nextInt();
		StackUsingLinkedList st = new StackUsingLinkedList();
		st.clearLinkedList();
		while (n > 0) {
			// count++;
			int first = Integer.parseInt(in.nextToken());
			if (first == 1) {
				long next = Integer.parseInt(in.nextToken());
				st.push(next);
			}
			if (first == 2) {
				st.pop();
			}
			if (first == 3) {
				System.out.println(st.getMax());
			}
			n--;
		} // System.out.println("Count is : " + count);

	}

}

class StackUsingLinkedList {
	public LinkedList linkedList;

	public long firstMax = 0;
	public long secondMax = 0;

	StackUsingLinkedList() {
		this.linkedList = new LinkedList<>();
	}

	public void size() {
		System.out.println(this.linkedList.size());
	}

	public void push(long data) {
		this.linkedList.addFirst(data);
		if (data >= this.firstMax) {
			this.firstMax = data;
		}
	}

	public void pop() {
		long popNum = (long) this.linkedList.removeFirst();
		if (popNum == this.firstMax) {
			this.firstMax = 0;
			this.updateFirstMax();

		}
	}

	public void updateFirstMax() {
		Iterator itr = this.linkedList.iterator();

		while ((itr.hasNext())) {
			long getElement = (long) itr.next();
			if (getElement >= this.firstMax) {
				this.firstMax = getElement;
			}
		}
	}

	public long getMax() {
		return this.firstMax;
	}

	public void clearLinkedList() {
		this.linkedList.clear();
	}

	public void printStack() {
		Iterator itr = this.linkedList.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	public void printBothMax() {
		System.out.println("First Max :" + this.firstMax);
	}

}
