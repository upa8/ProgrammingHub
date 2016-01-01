package com.upa.java.multithreading;

public class TestMultitasking1 extends Thread {
	@Override
	public void run() {
		System.out.println("task one");
	}

	public static void main(String args[]) {
		TestMultitasking1 t1 = new TestMultitasking1();
		TestMultitasking1 t2 = new TestMultitasking1();
		TestMultitasking1 t3 = new TestMultitasking1();

		t1.start();
		t2.start();
		t3.start();
	}
}