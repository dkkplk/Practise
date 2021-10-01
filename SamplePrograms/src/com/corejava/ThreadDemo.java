package com.corejava;

public class ThreadDemo {

	private static Object a = new Object();
	private static Object b = new Object();
	private static Object c = new Object();

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = () -> {

			synchronized (a) {
				try {
					
					System.out.println("Runnable r1 going to wait");
					a.wait();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Runnable r1 came out from wait");
				a.notify();
			}

		};

		Runnable r2 = () -> {

			synchronized (b) {
				try {
					System.out.println("Runnable r2 going to wait");
					b.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Runnable r2 came out from wait");
				b.notify();
				
			}

		};
		Runnable r3 = () -> {

			

			
		};

		Thread t1 = new Thread(r1, "T1");
		Thread t2 = new Thread(r2, "T2");
		Thread t3 = new Thread(r3, "T3");

		
		t1.start();
		t2.start();
		t3.start();
		
		Thread.currentThread().sleep(10000);
	}

}
