package controlStatement;

class Student{
	int age;
	String name;	
}

public class Main {
	public static void main(String[] args) {
		
		
		Student jojo = new Student();
		jojo.age = 22;
		jojo.name = "Nikhil";
		System.out.println(jojo.age + " " + jojo.name);
		
		
		Student jojo1 = new Student();
		jojo1.age = 23;
		jojo1.name = "Harry";
		System.out.println(jojo1.age + " " + jojo1.name);
			
	}
}
