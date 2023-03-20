package Lab;

public class Exceptionstring {

	    public static void main(String[] args) {
	        try {
	            String str = null;
	            int length = str.length();
	            System.out.println("Length of the string: " + length);
	        } catch (NullPointerException e) {
	            System.out.println("Error: " + e.getMessage());
	        } finally {
	            System.out.println("The try-catch block has finished executing.");
	        }
	    }
	}


