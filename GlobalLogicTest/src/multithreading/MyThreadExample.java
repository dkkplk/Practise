package multithreading;

public class MyThreadExample {

	public static void main(String[] args) {

		MyThread mt = new MyThread();

		Thread t1 = new Thread(mt::printSmallLetters, "T1");
		Thread t2 = new Thread(mt::printCapitalLetters, "T2");

		t1.start();
		t2.start();

	}

}
