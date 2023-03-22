package Threading;

import java.util.Scanner;

public class NestedTryCatch {

	public static void main(String[] args) {
		
		int [] marks = new int[3];
		marks[0] = 22;
		marks[1] = 10;
		marks[2] = 19;
		
		Scanner in = new Scanner(System.in);
		System.out.print("enter the number : ");
		int ind = in.nextInt();
		try {
			System.out.println("Welcome to this");
		try {
			System.out.println(marks[ind]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This number is not exit");
			System.out.println("Exception in level 2");
		}
	   }
		catch(Exception e) {
			System.out.println("Exception in level 1");
		}
}}
