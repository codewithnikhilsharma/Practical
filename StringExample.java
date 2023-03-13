package NLab;

import java.util.Scanner;

public class StringExample {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter a word:");
	        String word = scanner.nextLine();

	        int length = word.length();
	        char firstChar = word.charAt(0);
	        char lastChar = word.charAt(length - 1);
	        String reversedWord = reverseString(word);

	        System.out.println("The length of the word is: " + length);
	        System.out.println("The first character of the word is: " + firstChar);
	        System.out.println("The last character of the word is: " + lastChar);
	        System.out.println("The word reversed is: " + reversedWord);
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return sb.toString();
	    }
	}


