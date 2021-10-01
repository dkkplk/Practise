package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	public static void main(String[] args) {
		DeadLockExample deadLock = new DeadLockExample();
		new Thread(deadLock::operation1, "T1").start();
		new Thread(deadLock::operation2, "T2").start();
	}

	public void operation1() {
		lock1.lock();
		System.out.println("Lock 1 acquired and waiting to acquire lock2");
		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock2.lock();
		System.out.println("Lock 2 acquired");

		System.out.println("Performing Operation 1");

		lock2.unlock();
		lock1.unlock();

	}

	public void operation2() {
		lock2.lock();
		System.out.println("Lock 2 acquired and waiting to accuare lock 1");

		try {
			Thread.currentThread().sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock1.lock();
		System.out.println("Lock 1 acquired ");

		System.out.println("Performing operation 2");

		lock1.unlock();
		lock2.unlock();

	}
}
