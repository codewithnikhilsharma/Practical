package JavaBasic;

	class Animal {
	    void eat() {
	        System.out.println("Eating...");
	    }
	}

	class Dog extends Animal {
	    void bark() {
	        System.out.println("Barking...");
	    }
	}

	public class Inheritance {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.eat();
	        dog.bark();
	    }
	}


