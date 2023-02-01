package controlStatement;

import java.util.Scanner;

public class Whileloop2 {

	
	public static void main(String[] args) {
		
		// Printing odd numbers using while loop

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the limit: ");
	    int limit = sc.nextInt();
	    
	    int number = 1;
	    while (number <= limit) {
	      System.out.println(number);
	      number += 2;
	}
}}
