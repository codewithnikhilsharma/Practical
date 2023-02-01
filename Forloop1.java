package controlStatement;

import java.util.Scanner;
public class Forloop1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your Number : ");
		int no = in.nextInt();
		
		for(int i = 1; i<=no; i++) {
			
			System.out.println( i + " ");
		}
	}
}
