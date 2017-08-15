package com.upa.codebook.LinkedList;

public class LinkList<T> {

	private static class Node<T> {

		private final T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}

		@Override
		public String toString() {
			return this.data.toString();
		}
	}

	private Node<T> first = null;

	public void addFirst(T data) {
		Node<T> newFirst = new Node<T>(data);
		newFirst.next = this.first;
		this.first = newFirst;
	}

	public T removeFirst() {
		Node<T> oldFirst = this.first;
		this.first = this.first.next;
		return oldFirst.data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		Node current = this.first;
		while (current != null) {
			builder.append(current).append(" ");
			current = current.next;
		}
		return builder.toString();
	}

	public boolean isEmpty() {
		return this.first == null;
	}

}
