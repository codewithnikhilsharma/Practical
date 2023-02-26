package Now;

public class Basic {
	 public static void main(String[] args) {
	        int num1 = 10; // declare and initialize an integer variable
	        double num2 = 3.14; // declare and initialize a double variable
	        boolean isTrue = true; // declare and initialize a boolean variable
	        
	        if (num1 > num2) { // if-else statement
	            System.out.println(num1 + " is greater than " + num2);
	        } else {
	            System.out.println(num2 + " is greater than or equal to " + num1);
	        }
	        
	        for (int i = 1; i <= 5; i++) { // for loop
	            System.out.println("Loop iteration " + i);
	        }
	        
	        System.out.println("The value of isTrue is " + isTrue);
	    }
}
