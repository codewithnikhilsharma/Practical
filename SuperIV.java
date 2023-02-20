package Now;

class Shape { // parent class
	String name = "circle"; // data member of child class
}
	class Size extends Shape{ // child class
		
	String name = "No Size"; // data member of child class
	void print (){ // child class method
		System.out.println(name); // it represent child class
		System.out.println(super.name);// it represent immiditiate parent class tv
		
}}
class SuperIV{
	public static void main(String args[]){
		Size obj = new Size();
		obj.print();
		
	}
}

 
