package Array;

public class Three {

	 public static void main(String[] args) {
			
		  // create matrix
		  int a [][] = {{1 , 1 ,1},{2,2,2} , {3, 3 ,3 } };
		  int b [][] = {{1 , 1, 1},{2, 2, 2} , {3 , 3, 3}};
		  
		  int c[][] = new int [3][3];
		  
		  for(int i =0; i<3; i++) { // row
			  for(int j=0; j<3; j++) { // colm
				  c[i][j] = a[i][j]*b[i][j];
				  System.out.print(c[i][j]+ " ");
			  }
			      System.out.println();
		  }
	}
	}

