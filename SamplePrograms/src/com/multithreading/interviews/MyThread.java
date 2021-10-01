package com.multithreading.interviews;

public class MyThread implements Runnable {

	private final int printNumberTill = 30;
	static int number = 1;
	int remainder;
	static Object lock = new Object();

	public MyThread(int remainder) {

		this.remainder = remainder;
	}

	@Override
	public void run() {

		while (number < printNumberTill - 1) {

			synchronized (lock) {

				while (number % 3 != remainder) {
					try {
						lock.wait();
					} catch (Exception e) {
						// TODO: handle exception
					}
				}

				System.out.println(Thread.currentThread().getName() + "" + number);
				number++;
				lock.notifyAll();

			}
		}

	}

}
