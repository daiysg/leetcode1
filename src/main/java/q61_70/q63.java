package q61_70;

//dp, the dp[i][j](total paths) 
// = dp[i+1][j](paths via down neighbor) + 
// dp[i][j+1](paths via right neighbor)
// classical dp, just need 1-d array, start from row to row, array result always updated

public class q63 {

	public int uniquePathsWithObstacles(int[][] grid) {
		
		 int row  = grid.length; 
		 if(row == 0) return 0; 
		 
		 int col = grid[0].length;
		 if (col == 0) return 0;
		 
		 int dp[] = new int[col];
		 
		 if (grid[0][0] == 0) {
			 dp[0] = 1;
		 } else {
			 dp[0] = 0;
		 }
		 
		 //row 0;
		 for (int i=1; i<col; i++) {
			 if (grid[0][i] == 1) {
				 dp[i] = 0;
			 } else {
				 dp[i] = dp[i-1];
			 }
		 }
		 
		 // row n 
		 for (int i=1; i<row; i++) {
			 // col 0 of row n
			 if (grid[i][0] == 1) {
				 dp[0] = 0;
			 } 
			 
			 for (int j=1; j<col; j++) {
				 if (grid[i][j] == 1) {
					 dp[j] = 0;
				 } else {
					 // dp[j-1] previous col
					 // dp[j] previous row
					 dp[j] = dp[j-1]+dp[j];
				 }
			 }
		 }
		 
		 return dp[col-1];
	}
}
