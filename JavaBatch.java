package Object;

public class JavaBatch {
      
	// defining field
	
	int id;
	String name;
	
	public static void main(String[] args) {
		
		// create object
		
		JavaBatch jb = new JavaBatch();
		
		JavaBatch jb1 = new JavaBatch();
		
		// print value
		
		jb.id = 1;
		jb.name = "Nikhil";
		
		jb1.id = 2;
		jb1.name = "Sharma";
		
		System.out.println(" id is : " + jb.id + " Name : "  + jb.name );
		System.out.println(" id is : " + jb1.id + " Name : "  + jb1.name );
	}
}
