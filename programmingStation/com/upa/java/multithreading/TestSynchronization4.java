package com.upa.java.multithreading;

class Table4 {

	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread14 extends Thread {
	@Override
	public void run() {
		Table4.printTable(1);
	}
}

class MyThread24 extends Thread {
	@Override
	public void run() {
		Table4.printTable(10);
	}
}

class MyThread34 extends Thread {
	@Override
	public void run() {
		Table4.printTable(100);
	}
}

class MyThread44 extends Thread {
	@Override
	public void run() {
		Table4.printTable(1000);
	}
}

public class TestSynchronization4 {
	public static void main(String t[]) {
		MyThread14 t1 = new MyThread14();
		MyThread24 t2 = new MyThread24();
		MyThread34 t3 = new MyThread34();
		MyThread44 t4 = new MyThread44();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}