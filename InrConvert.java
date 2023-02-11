package Today;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InrConvert {

	  public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.print("Enter the amount in Indian Rupees: ");
	    
	    double rupees = scanner.nextDouble();
	    double usd = rupees / 74.0;
	    
	    DecimalFormat df = new DecimalFormat("#.##");
	    System.out.println("Amount in US Dollars: $" + df.format(usd));
	  }
	}


