package Oops;

class info{
	
	String name;
	int age;
	
	public void Sinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	info(){
		System.out.println(" this is parameterized constructor");
	}
	
	info(String name , int age){
		this.name = name;
		this.age = age;
		
	}
}

public class Student {
public static void main(String[] args) {
	
	info s1 = new info(" Nikhil" , 22);
	s1.Sinfo();
}
}
