package Today;

public class Main {
  
//	public class Main {
		  public static void main(String[] args) {
		    int n = 10;
		    System.out.println("The sum of the first " + n + " natural numbers is " + sumOfFirstNNaturalNumbers(n));
		  }

		  public static int sumOfFirstNNaturalNumbers(int n) {
		    return n * (n + 1) / 2;
		  }
		}


