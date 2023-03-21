package Lab;

public class ArrayException {
	    public static void main(String[] args) {
	        try {
	            int[] numbers = {1, 2, 3, 4, 5};
	            System.out.println("The sixth number is: " + numbers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds!");
	        }
	    }
	}


