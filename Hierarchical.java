package Today;

	class Anima {  // parent class
	   public void eat() {
	      System.out.println("The animal is eating");
	     }
	   }

	
	class Dg extends Anima {  // child class 1
	   public void bark() {
	      System.out.println("The dog is barking");
	    }
	  }

	
	class Cat extends Anima { // child class 2
	   public void meow() {
	      System.out.println("The cat is meowing");
	    }
	  }


	// Main class
       public class Hierarchical {

	   public static void main(String[] args) {
	      Dg dog = new Dg();
	      Cat cat = new Cat();

	      
	      dog.eat(); 
	  

	     
	      dog.bark(); 

	     
	      cat.meow(); 
	      
	      cat.eat(); 
	   }
	}


