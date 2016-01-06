package com.upa.java.builtInDS;

class Room<T> {

	private T t;

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return this.t;
	}
}

public class Generics {
	public static void main(String[] args) {
		Room<Integer> room = new Room<Integer>();
		room.add(60);

		Integer i = room.get();
		System.out.println(i);
	}
}