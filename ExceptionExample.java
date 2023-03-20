package Lab;

public class ExceptionExample {

	    public static void main(String[] args) {
	        try {
	            int[] arr = new int[5];
	            arr[10] = 10;
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("The try-catch block has finished executing.");
	        }
	    }
	}


