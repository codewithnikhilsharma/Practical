package Today;

 class Animal1 {
 void makeSound() {
 System.out.println("The animal makes a sound");
 }
 }

 class Dog1 extends Animal {
 void bark() {
 System.out.println("The dog barks");
 }
 }

 class LabradorRetriever extends Dog {
 void fetch() {
 System.out.println("The Labrador Retriever fetches");
 }
 }
       public class Multiple1 {
		public static void main(String[] args) {
		LabradorRetriever labradorRetriever = new LabradorRetriever();
		labradorRetriever.makeSound();
		labradorRetriever.bark();
		labradorRetriever.fetch();
		}
		}

