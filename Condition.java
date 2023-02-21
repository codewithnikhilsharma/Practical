package Now;

import java.util.Scanner;

public class Condition {
 
	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = in.nextInt();
		
		if(n%15!=0 && (n%5==0|| n%3==0)) {
			System.out.println("The no is divisible of 5 and 3 but not 15");
	}
		else {
			System.out.println("Not Match the required condition");
		}
	}
}
