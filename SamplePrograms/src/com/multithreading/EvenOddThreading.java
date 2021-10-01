package com.multithreading;

public class EvenOddThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadUtil tu = new ThreadUtil();

		Runnable evenNumber = () -> tu.printEvenNumbers();
		Runnable oddNumber = () -> tu.printOddNumbers();

		Thread t1 = new Thread(evenNumber);
		Thread t2 = new Thread(oddNumber);

		t1.start();
		t2.start();

	}

}
