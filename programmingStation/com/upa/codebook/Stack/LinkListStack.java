package com.upa.codebook.Stack;

import com.upa.codebook.LinkedList.LinkList;

public class LinkListStack<T> {

	private final LinkList<T> linkedList = new LinkList<>();

	public void push(T data) {
		this.linkedList.addFirst(data);
	}

	public T pop() {
		return this.linkedList.removeFirst();
	}

	public boolean isEmpty() {
		return this.linkedList.isEmpty();
	}

	@Override
	public String toString() {
		return this.linkedList.toString();
	}
}