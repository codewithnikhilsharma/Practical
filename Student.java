package Oops;

class info{
	
	String name;
	int age;
	
	public void Sinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
}

public class Student {
public static void main(String[] args) {
	
	info s1 = new info();
	s1.name = "nikhil";
	s1.age = 22;
	
	s1.Sinfo();
}
}
