package q71_80;

public class q73 {
	
	//should do this in-place, the way is to use two other variables to set first row/col to
	// check whether contains 0
	// then use first row, column to record the 0 in middle.
	// attention, remember the way to get the col/row in 2d matrix
	public void setZeroes(int[][] matrix) {

		int m = matrix.length; // number of row
		int n = matrix[0].length; // number of col
		boolean firstRow = false, firstCol = false;
		
		//check first row;
		for (int i=0; i<n; i++) {
			if (matrix[0][i] == 0) {
				firstRow = true;
				break;
			}
		}
		
		for (int i=1; i<m; i++) {
			//check first col
			if (matrix[i][0] == 0) {
				firstCol = true;
			}
			for (int j=1; j<n; j++) {
				if (matrix[i][j]== 0) {
					matrix[i][0] = 0;
					matrix [0][j] = 0;
				}
			}
		}
		

		for (int i=1; i<m; i++) {

			for (int j=1; j<n; j++) {
				if (matrix[i][0] == 0 || matrix [0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		  for(int i=m-1;i>=0;i--)
		        for(int j=n-1;j>=0;j--)
		            if(i == 0 && firstRow == true || j == 0 && firstCol == true || matrix[0][j] == 0 || matrix[i][0] == 0 )
		                matrix[i][j] = 0;
		    return;
		
	}
}
