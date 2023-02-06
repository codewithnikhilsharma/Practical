package Object;

import java.util.Scanner;

public class Method {
  
	public static void main(String[] args) {
		// create scanner class
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		// read no from user
		int num= in.nextInt();
		//call the method
		findevenodd(num);	
	}
	
	// create a method
	public static void findevenodd(int num) {
		if(num%2==0) {
			System.out.println(num + "Even");
		}	
		else {
			System.out.println("odd");
		}
	}
}
