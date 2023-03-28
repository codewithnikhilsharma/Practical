package Thread;

 class Threa  extends Thread{
 public void run() {
	 System.out.println(" I am Thread..thread is running");
	 
	
 }
 public static void main(String[] args) {
	Thread  t = new Thread();
	t.start();
	t.setName("dd");
	String s = t.getName();
	System.out.println(s);
}
}
