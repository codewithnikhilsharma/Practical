package Now;

public class Overloadingtypepepromotion {
	void add(int a , double b) {
		System.out.println(a+b);
	}
	
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		Overloadingtypepepromotion obj = new Overloadingtypepepromotion();
		obj.add(2, 3);
		obj.add(10, 20,30);
	}
  }
