package Lab;

public class Plain {
	    public static void main(String[] args) {
	        String word = "racecar";
	        boolean isPalindrome = true;
	        for (int i = 0; i < word.length() / 2; i++) {
	            if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        if (isPalindrome) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }
	    }
	}


