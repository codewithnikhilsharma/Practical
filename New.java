package Threading;

public class New {

	public static void main(String[] args) {
	
		try {
			
			try {
				int a = 10/0;
				System.out.println(a);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int arr[] = new int[3];
				int a=5;
				arr[2] = 22;
				System.out.println(a);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("Both inner try done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("done");
		
	}
}
