package Now;

//Animal
 class Animal {
 public void makeSound() {
     System.out.println("Some generic animal sound");
 }
}

//Dog
 class Dog extends Animal {
 public void makeSound() {
     System.out.println("Woof");
 }
}

//Cat.java
 class Cat extends Animal {
 public void makeSound() {
     System.out.println("Meow");
 }
}


public class Poly {
	
	 public static void main(String[] args) {
	     Animal animal1 = new Dog();
	     Animal animal2 = new Cat();
	     
	     animal1.makeSound();
	     animal2.makeSound();
	 }
	}
