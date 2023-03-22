package Threading;

public class Throw {

	public static void check(int marks) {
	
		if(marks<60) {
	throw new ArithmeticException("student is not eligible");		
		}
		else {
			System.out.println("student is eligible");
		}
	}
	public static void main(String[] args) {
		check(58);
	}
}
