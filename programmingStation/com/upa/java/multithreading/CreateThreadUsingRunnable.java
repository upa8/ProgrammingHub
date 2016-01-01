package com.upa.java.multithreading;

public class CreateThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I am a thread \n using runnable interface ");
	}

	public static void main(String args[]) {
		CreateThreadUsingRunnable test = new CreateThreadUsingRunnable();
		Thread t1 = new Thread(test);
		t1.start();
	}
}
