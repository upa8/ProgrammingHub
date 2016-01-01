package com.upa.java.multithreading;

class Table1 {

	void printTable(int n) {
		synchronized (this) {// synchronized block
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(400);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}// end of the method
}

class MyThread11 extends Thread {
	Table t;

	MyThread11(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		this.t.printTable(5);
	}

}

class MyThread22 extends Thread {
	Table t;

	MyThread22(Table t) {
		this.t = t;
	}

	@Override
	public void run() {
		this.t.printTable(100);
	}
}

public class TestSynchronizedBlock1 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread11 t1 = new MyThread11(obj);
		MyThread22 t2 = new MyThread22(obj);
		t1.start();
		t2.start();
	}
}