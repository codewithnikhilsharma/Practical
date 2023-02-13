package Today;

class Animal {
void makeSound() {
System.out.println("The animal makes a sound");
}
}

class Dog extends Animal {
void bark() {
System.out.println("The dog barks");
}
}

public class Single {

		public static void main(String[] args) {
		Dog dog = new Dog();
		dog.makeSound();
		dog.bark();
		}	
      }
