package Today;

// Hierachicalinal inheritance

class Vehical { // parent class A
	void running () {
		System.out.println("Running mode on");
	}
  }

   class Car1 extends Vehical{ // child class 1
	   void run() {
		   System.out.println(" Car run mode on");
	   }
     }
    
   class Bikel extends Vehical{ // child class 2
	    void speed() {
	    	System.out.println("Speed is very high");
	    }
      }

public class Hierachicalin {
public static void main(String[] args) {
	Bikel b = new Bikel();
	b.running();
	b.speed();
	Car1 c = new Car1();
	c.run();
	c.running();
}
}
