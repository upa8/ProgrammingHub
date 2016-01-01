package com.upa.java.multithreading;

public class TestJoinMethod1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		try {
			t1.join(10000); // Run this thread for 10000
			// t1.join(); // Run this thread first
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}