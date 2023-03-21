package Lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        try {
	            System.out.print("Enter a number: ");
	            int num1 = sc.nextInt();
	            System.out.print("Enter another number: ");
	            int num2 = sc.nextInt();
	            int result = num1 / num2;
	            System.out.println("The result is: " + result);
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Invalid input!");
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero!");
	        }
	    }
	}


