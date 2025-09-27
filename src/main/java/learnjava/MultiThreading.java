package learnjava;

class MyThread extends Thread{
	public void run() {System.out.println(getName()+ " runns with priority " +getPriority());
 /* for(int i=0;i<=5;i++)
  {
	  System.out.println("Thread running"+ i);
  }*/
  }
}
public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		MyThread  t1=new MyThread();
		MyThread  t2=new MyThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		//t1.join();    // main() waits until t1 finishes
		System.out.println("Main thread finished after t1");
	}

}
