package controlStatement;

import java.util.Scanner;

public class DoWhileloop {

	public static void main(String[] args) {
		 
		// printing even numbers using do while loop

	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter the limit: ");
	       int limit = sc.nextInt();

	       int numbers = 2;
	       do {
	    	   System.out.println(numbers);
	    	   numbers += 2;
	          } while(numbers<=limit);
	         }   
	         }

