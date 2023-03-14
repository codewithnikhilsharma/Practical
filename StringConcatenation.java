package String;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		
	// Concatenation
		
	Scanner in = new Scanner(System.in);
	
	System.out.print("Enter First Name : ");
	
	String First = in.next();
	
	System.out.print("Enetr Last Name : ");
	
	String Last = in.next();
	
	String fullname = First + " " + Last;
	
	System.out.print("Your Full Name is : " + fullname );
		
		
		
	}
}
