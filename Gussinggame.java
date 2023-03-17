package Lab;

import java.util.Scanner;

public class Gussinggame {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int secretNumber = (int)(Math.random() * 100) + 1;
	        int guess = 0;
	        int numGuesses = 0;

	        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");

	        while (guess != secretNumber) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            numGuesses++;

	            if (guess < secretNumber) {
	                System.out.println("Too low! Guess again.");
	            } else if (guess > secretNumber) {
	                System.out.println("Too high! Guess again.");
	            }
	        }

	        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses!");
	    }
	}


