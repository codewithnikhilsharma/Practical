package Oops;

public class Istr {

	    public static void main(String[] args) {
	        // Creating a string using a character array
	        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
	        String str1 = new String(charArray);
	        System.out.println("String 1: " + str1);

	        // Creating a string using a byte array
	        byte[] byteArray = {72, 101, 108, 108, 111};
	        String str2 = new String(byteArray);
	        System.out.println("String 2: " + str2);

	        // Checking if a string contains a substring
	        String str3 = "The quick brown fox jumps over the lazy dog.";
	        boolean containsSubstring = str3.contains("fox");
	        System.out.println("Does string 3 contain 'fox'?: " + containsSubstring);

	        // Reversing a string
	        String str4 = "racecar";
	        String reversedStr = new StringBuilder(str4).reverse().toString();
	        System.out.println("Reversed string: " + reversedStr);

	        // Joining an array of strings into a single string
	        String[] words = {"The", "quick", "brown", "fox"};
	        String joinedStr = String.join(" ", words);
	        System.out.println("Joined string: " + joinedStr);
	    }
	}


