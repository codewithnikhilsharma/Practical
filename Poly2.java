package Now;

//Vehicle.java


 class Vehicle1 {
 public void startEngine() {
     System.out.println("Starting the engine of the vehicle");
 }
}

//Car.java
 class Car1 extends Vehicle1 {
 public void startEngine() {
     System.out.println("Starting the engine of the car");
 }
}

//Truck.java
 class Truck extends Vehicle1 {
 public void startEngine() {
     System.out.println("Starting the engine of the truck");
 }
}


public class Poly2 {

	 public static void main(String[] args) {
	     Vehicle1 vehicle1 = new Car1();
	     Vehicle1 vehicle2 = new Truck();
	     
	     vehicle1.startEngine();
	     vehicle2.startEngine();
	 }
	}

