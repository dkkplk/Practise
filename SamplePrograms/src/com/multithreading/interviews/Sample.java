package com.multithreading.interviews;

public class Sample {

	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r1 = new MyThread(1);
		Runnable r2 = new MyThread(2);
		Runnable r3 = new MyThread(0);

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		Thread t3 = new Thread(r3, "T3");

		t1.start();
		t2.start();
		t3.start();

	}

}
