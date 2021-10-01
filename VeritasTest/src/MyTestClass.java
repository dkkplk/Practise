
public class MyTestClass {
	
	public synchronized void a()
	{
		System.out.println("A Method and Thread name is: " +Thread.currentThread().getName());
	}
	
	public synchronized void b()
	{
		System.out.println("B Method and Thread name is: " +Thread.currentThread().getName());
	}
	

	public synchronized void c()
	{
		System.out.println("B Method and Thread name is: " +Thread.currentThread().getName());
	}

}
