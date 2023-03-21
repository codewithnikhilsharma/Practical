package Lab;

import java.util.Scanner;

public class Java {
	    public static void main(String[] args) {
	        // Variables and data types
	        int num1 = 10;
	        double num2 = 3.14;
	        String str = "Hello, world!";
	        boolean bool = true;
	        
	        // Input and output
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter your name: ");
	        String name = sc.nextLine();
	        System.out.println("Hello, " + name + "!");
	        
	        // Conditional statements
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();
	        if (age >= 18) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("You are not an adult.");
	        }
	        
	        // Loops
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        int sum = 0;
	        for (int i = 1; i <= num; i++) {
	            sum += i;
	        }
	        System.out.println("The sum of the numbers from 1 to " + num + " is: " + sum);
	        
	        // Arrays
	        int[] arr = {1, 2, 3, 4, 5};
	        int arrSum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            arrSum += arr[i];
	        }
	        System.out.println("The sum of the array is: " + arrSum);
	        
	        // Exception handling
	        try {
	            int x = 5 / 0;
	        } catch (ArithmeticException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


