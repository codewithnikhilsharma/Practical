package Threading;

public class All {

	    public static void main(String[] args) {
	        try {
	            // Divide by zero exception
	            int result = 10 / 0;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println(e);
	        }

	        try {
	            // Index out of bounds exception
	            int[] arr = new int[3];
	            System.out.println("Element at index 3: " + arr[3]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println(e);
	        }

	        try {
	            // Null pointer exception
	            String str = null;
	            System.out.println("Length of string: " + str.length());
	        } catch (NullPointerException e) {
	            System.out.println(e);
	        } finally {
	            System.out.println("Finally block executed!");
	        }
	    }
	}


