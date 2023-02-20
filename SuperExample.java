package Now;

 class ParentClass {
    protected int x; // member variable

    public ParentClass(int x) { // constructor
        this.x = x; // initialize x with the parameter value
    }

    public void printX() {  // method to print x
        System.out.println("Parent x: " + x);
    }
}

 class ChildClass extends ParentClass {
    protected int y; // member variable

    public ChildClass(int x, int y) {
        super(x); // calls the constructor of the ParentClass with parameter x
        this.y = y; // initialize y with the parameter value
    }

    public void printY() { // method to print y
        System.out.println("Child y: " + y);
    }

    @Override
    public void printX() { // overridden method to print x
        super.printX(); // calls the printX() method of the ParentClass
        System.out.println("Child x: " + x);
    }
}


public class SuperExample {
	
	    public static void main(String[] args) { // main method
	        ChildClass child = new ChildClass(10, 20); 
	        child.printX(); 
	        child.printY(); 
	    }
	}



