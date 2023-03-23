package Threading;

public class Thr {

	public static void mydisplay(int a) throws ArithmeticException{
		if(a<35) {
			throw new ArithmeticException("you are pass");
		}
		else {
			System.out.println("You are pass");
		}
		
	}
	public static void main(String args[]) {
		mydisplay(30);
		System.out.println("rest of the code");
	}
  
}
