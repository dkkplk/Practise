package multithreading;

public class MyThread {

	private String smallLetters = "abcdefghijklmnopqrstuvwxyz";
	private String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	int count = 1;
	int counter = 0;

	public void printSmallLetters() {

		synchronized (this) {

			while (count < 52) {
				while (count % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

				System.out.print(smallLetters.charAt(counter) + ",");
				count++;
				notifyAll();
			}

		}

	}

	public void printCapitalLetters() {

		synchronized (this) {

			while (count < 52) {

				while (count % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print(capitalLetter.charAt(counter)+ ",");
				count++;
				counter++;
				notifyAll();
			}

		}

	}

}
