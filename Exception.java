package Lab;

public class Exception {

	    public static void main(String[] args) {
	        try {
	            // Code that might throw an exception
	            int x = 5/0;
	            
	        } catch (ArithmeticException e) {
	            // Code to handle the exception
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


