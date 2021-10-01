
public class DeadLock extends Thread {

	A a = new A();
	B b = new B();

	public void m1() {
		this.start();
		a.a(b);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		b.b(a);
	}

}
