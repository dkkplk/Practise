package com.multithreading;

public class ThreadUtil {

	int counter = 1;
	static int NUMBER = 20;

	void printOddNumbers() {
		// TODO Auto-generated method stub

		synchronized (this) {

			while (counter < NUMBER) {

				while (counter % 2 == 0) {

					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.print(counter + " ");
				counter++;
				notify();
			}
		}
	}

	void printEvenNumbers() {
		// TODO Auto-generated method stub

		synchronized (this) {

			while (counter < NUMBER) {

				while (counter % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				System.out.print(counter + " ");
				counter++;
				notify();
			}

		}
	}
}
