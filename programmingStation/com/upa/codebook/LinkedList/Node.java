package com.upa.codebook.linkedList;

public class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
	}

	public void displayNode() {
		System.out.print(this.data);
	}
}