package Oops;

class pen{
String colour;
String type;
int num;

public void write() {
	System.out.println(" Write something");
}	

public void PrintColour() {
	System.out.println(this.colour);
}

public void Printtype() {
	System.out.println(this.type);
}

public void Printnum() {
	System.out.println(this.num);
}
}

public class Oop {
 public static void main(String[] args) {
	pen ans = new pen();
	pen ans1 = new pen();
	
	ans1.colour = "Black";
	ans1.type = "Ball";
	ans1.num = 20;
	
	ans.colour = "Blue";
	ans.type = "gel";
	ans.num = 20;
	
	ans.write();
	ans.PrintColour();
	ans.Printtype();
	ans.Printnum();
	
	ans1.write();
	ans1.PrintColour();
	ans1.Printtype();
	ans1.Printnum();
	
	
	
	
	
	
	 
}
}
