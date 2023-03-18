package Oops;

public class Str {

	    public static void main(String[] args) {
	        // Creating a string
	        String str = "This is a string.";

	        // Extracting a substring from the string
	        String subStr = str.substring(5, 7);
	        System.out.println("Substring: " + subStr);

	        // Replacing a substring in the string
	        String newStr = str.replace("is", "was");
	        System.out.println("New string: " + newStr);

	        // Removing leading and trailing whitespace from the string
	        String strWithSpaces = "   This is a string with spaces.   ";
	        String trimmedStr = strWithSpaces.trim();
	        System.out.println("Trimmed string: " + trimmedStr);

	        // Splitting the string into an array of substrings
	        String strToSplit = "The quick brown fox jumps over the lazy dog.";
	        String[] substrings = strToSplit.split(" ");
	        System.out.println("Substrings:");
	        for (String substring : substrings) {
	            System.out.println(substring);
	        }

	        // Converting a string to an integer
	        String strToInt = "42";
	        int integer = Integer.parseInt(strToInt);
	        System.out.println("Integer value: " + integer);
	    }
	}


