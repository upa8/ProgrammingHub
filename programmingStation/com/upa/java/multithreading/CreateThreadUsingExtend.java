package com.upa.java.multithreading;

public class CreateThreadUsingExtend extends Thread {

	public static void main(String[] args) {

		CreateThreadUsingExtend test = new CreateThreadUsingExtend();
		test.run();
	}

	@Override
	public void run() {
		System.out.println(" Thread is running ");
	}

}
