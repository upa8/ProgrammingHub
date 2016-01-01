package com.upa.java.multithreading;

public class TestJoinMethod3 extends Thread {
	@Override
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		TestJoinMethod3 t1 = new TestJoinMethod3();
		TestJoinMethod3 t2 = new TestJoinMethod3();
		System.out.println("Name of t1:" + t1.getName());
		System.out.println("Name of t2:" + t2.getName());
		System.out.println("id of t1:" + t1.getId());

		t1.start();
		t2.start();

		t1.setName("Pratik Upacharya");
		System.out.println("After changing name of t1:" + t1.getName());
	}
}