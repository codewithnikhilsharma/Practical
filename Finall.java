package Threading;

public class Finall {

	public static void main(String[] args) {
		
	try {
		int a = 4/2;
		System.out.println(a);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	try {
		int a = 4/0;
		System.out.println(a);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
	try {
		int a = 4/0;
		System.out.println(a);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	
	finally {
		System.out.println("Always finally block will excecute");
	}
		
	}
}
