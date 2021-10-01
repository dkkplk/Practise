package com.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LiveLockExample {
	
	private Lock lock1 = new ReentrantLock(true);
	private Lock lock2 = new ReentrantLock(true);

	TimeUnit unit = TimeUnit.valueOf("MILLISECONDS");   
	public static void main(String[] args) {
		LiveLockExample liveLock = new LiveLockExample();
		new Thread(liveLock::operation1,"T1").start();
		new Thread(liveLock::operation2,"T2").start();

	}

	public void operation1()
	{
		while(true)
		{
			try {
				lock1.tryLock(50,unit);
				System.out.println("lock 1 acquaired and trying to acquire lock 2");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			
		}
	}
	
	public void operation2()
	{
		
	}
}
