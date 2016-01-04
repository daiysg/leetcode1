package q61_70;

//same as q63
// dp, find the result by row and update 

public class q64 {

	public int minPathSum(int[][] grid) {
        
		 int m = grid.length, n = grid[0].length;
		    int[] dp = new int[n];
		    for(int j=0; j<n; j++){
		        dp[j] = (j == 0 ? 0 : dp[j-1]) + grid[0][j];
		    }
		    for(int i=1; i<m; i++){
		        dp[0] = dp[0] + grid[i][0];
		        for(int j=1; j<n; j++)
		             dp[j] = Math.min(dp[j], dp[j-1]) + grid[i][j];
		    }
		    return dp[n-1];
    }
}
