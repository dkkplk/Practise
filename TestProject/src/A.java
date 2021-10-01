
public class A {

	public synchronized void a(B b) {
		System.out.println("Method A" + Thread.currentThread().getName());

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		b.last();
	}

	public synchronized void last() {
		System.out.println("A last method");
	}
}
