package Now;

 class TestBinding {
    void show() { 
    	System.out.println("Is It clear");
    }
}

 class Binding extends TestBinding{
	 void show () {
		 System.out.println("override");
	 }
	 
	 public static void main(String[] args) {
		TestBinding obj = new Binding();
		obj.show();
	}
 }
