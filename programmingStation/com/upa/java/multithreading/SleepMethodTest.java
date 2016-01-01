package com.upa.java.multithreading;

public class SleepMethodTest extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		SleepMethodTest t1 = new SleepMethodTest();
		SleepMethodTest t2 = new SleepMethodTest();

		t1.start();
		t2.start();
	}
}
