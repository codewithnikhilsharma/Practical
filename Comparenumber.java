package NLab;

public class Comparenumber {
public static void main(String[] args) {
	
	String str1 = "Hello";
	String str2 = "Hello";
	int result = str1.compareTo(str2);
	if(result == 0){
	    System.out.println("Strings are equal");
	}
	else if(result < 0){
	    System.out.println("str1 is less than str2");
	}
	else{
	    System.out.println("str1 is greater than str2");
	}

}
}
