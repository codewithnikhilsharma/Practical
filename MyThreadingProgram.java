package Threading;

class MyThread extends Thread{	
	
	  public void run(){	
		  int i = 0;
		while(i<40) {
			System.out.println("MY Thread is Running");
			System.out.println("I am happy");
			i++;
		 }
	   }
     }

class MyThread1 extends Thread{		
	  public void run(){	
		  int i = 0;
		while(i<40) {
			System.out.println("Thread 2 is good");
			System.out.println("I am amazing happy");
			i++;
		 }
	   }
     }

public class MyThreadingProgram {
public static void main(String[] args) {
		
	MyThread t = new MyThread();
	MyThread1 t1 = new MyThread1();
	
	t.start();
	t1.start();
		
	}
 }
