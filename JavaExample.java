package Lab;

public class JavaExample {

	    public static void main(String[] args) {
	        // Declare and initialize variables
	        int num1 = 10;
	        int num2 = 20;
	        int sum = 0;
	        
	        // Add the two numbers
	        sum = num1 + num2;
	        
	        // Check if the sum is greater than 30
	        if (sum > 30) {
	            System.out.println("The sum is greater than 30.");
	        } else {
	            System.out.println("The sum is not greater than 30.");
	        }
	        
	        // Use a for loop to print numbers from 1 to 5
	        for (int i = 1; i <= 5; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        
	        // Use a while loop to print even numbers from 2 to 10
	        int i = 2;
	        while (i <= 10) {
	            System.out.print(i + " ");
	            i += 2;
	        }
	        System.out.println();
	    }
	}


