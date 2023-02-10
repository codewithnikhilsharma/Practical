package Today;

class Staticvariable1{
	
	int rollno;
	String name;
	float fee;
	static String college = "Ganga College"; // static variable
	
	// constructor
	
	Staticvariable1(int rollno, String name, float fee){
		this.rollno= rollno;
		this.name=name;
		this.fee=fee;
	}
	
	 // user defined method
	
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
}}




public class Staticvariable {
    
	public static void main(String[] args) {
		
		Staticvariable1 s1 = new Staticvariable1(11 , "Nikhl" , 33);
		Staticvariable1 s2 = new Staticvariable1(13 , "Sharma" , 23);
		s1.display();
		s2.display();
		
	}
}
