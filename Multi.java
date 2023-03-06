package Array;

public class Multi {

	public static void main(String[] args) {
		
		int[][] arr1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		int[][] arr2 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
		
		int[][] result = new int[3][3];

		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		    	
		        result[i][j] = 0;
		        for (int k = 0; k < 3; k++) {
		            result[i][j] += arr1[i][k] * arr2[k][j];
		        }
		    }
		}

		// Print the result
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        System.out.print(result[i][j] + " ");
		    }
		    System.out.println();
		}

	}
}
