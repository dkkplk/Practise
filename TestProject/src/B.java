
public class B {
	public synchronized void b(A a) {
		System.out.println("Method B" + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		a.last();
	}

	public synchronized void last() {
		System.out.println("B last method");
	}

}
