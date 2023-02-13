package Today;

public class MultipleInheritance{    
	public static void main(String[] args) {
		
		SILvl2Child lvl2Child = new SILvl2Child();
		lvl2Child.display();
		lvl2Child.show();
		lvl2Child.displayMore();
		}
		}

		class SIParent {
		void show() {
		System.out.println(" show details ");
		}
		}

		class SIChild extends SIParent {
		void display() {
		System.out.println("Show the result");
		}
		}

		class SILvl2Child extends SIChild {
		void displayMore() {
		System.out.println("Show more details");
		}
		}





		
		





