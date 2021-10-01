

class MyThread1 extends Thread{
	MyTestClass c = new MyTestClass();
    public void run(){
     c.a();
  }
}

class MyThread2 extends Thread{
    
	MyTestClass c = new MyTestClass();
	public void run(){
    	  c.b();
  }
}

class MyThread3 extends Thread{
	MyTestClass c = new MyTestClass();
    public void run(){
    	c.c();
  }
}
public class MyTestThread {

	public static void main(String[] args) {

		
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		
		MyThread1 t2 = new MyThread1();
		t2.setName("T2");
		
		MyThread1 t3 = new MyThread1();
		t3.setName("T3");
		
		

		t1.start();
		t2.start();
		t3.start();
	}

}
