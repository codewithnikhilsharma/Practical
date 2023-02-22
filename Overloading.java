package Now;

public class Overloading {
static int sum(int a , int b) {
	return a+b;
}

 static int sum(int x, int y, int z, int c) {
	 return x+y+z+c;
 }
 public static void main(String[] args) {
	System.out.println( Overloading.sum(5, 6));
	System.out.println( Overloading.sum(2 , 3 , 4, 1));
}
}
