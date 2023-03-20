package Threading;

class MyThreadRunnable implements Runnable{
	public void run() {
		  int i = 0;
			while(i<10) {
		System.out.println(" gun is fire ");
		i++;
	}
}
}

class MyThreadRunnable1 implements Runnable{
	public void run() {
		  int i = 0;
			while(i<40) {
		System.out.println(" gun 1 is fire ");
		i++;
	}
}
}

class MyThreadRunnable2 implements Runnable{
	public void run() {
		  int i = 0;
			while(i<40) {
		System.out.println(" Gun 2 is fire ");
		i++;
	}
}
}

public class RunnableInterface {
public static void main(String[] args) {
		
	MyThreadRunnable Bullet = new MyThreadRunnable();
	
	Thread Gun = new Thread(Bullet);
		
	MyThreadRunnable1 Bullet1 = new MyThreadRunnable1();
	
	Thread Gun1 = new Thread(Bullet1);
		
	MyThreadRunnable2 Bullet2 = new MyThreadRunnable2();
	
	Thread Gun2 = new Thread(Bullet2);
	
	Gun.start();
	Gun1.start();
	Gun2.start();
			
	}
}
