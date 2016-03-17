package q111_120;

public class q115 {

	
	//dp way. No Comment	
	// dp[0][0] = 1; 
	//dp[0][1 ... S.length() - 1] = 1; 
	// dp[1 ... T.length() - 1][0] = 0; 	
	// dp[i][j] = dp[i][j - 1]
	// if s[i] = t[j] dp[i][j] = dp[i][j - 1]+d[i-1][j-1]
	 public int numDistinct(String s, String t) {
	 
		 // remember for dp need to set length array, so length()+1
		 int[][] dp = new int[t.length() + 1][s.length() + 1];  
		  dp[0][0] = 1;  
		  for (int i = 1; i <= t.length(); i++) {  
		    dp[i][0] = 0;  
		  }  
		  for (int j = 1; j <= s.length(); j++) {  
		    dp[0][j] = 1;  
		  }  
		  
		  for (int i = 1; i <= t.length(); i++) {  
			    for (int j = 1; j <= s.length(); j++) {  
			      dp[i][j] = dp[i][j - 1];  
			      if (t.charAt(i - 1) == s.charAt(j - 1)) {  
			        dp[i][j] += dp[i - 1][j - 1];  
			      }  
			    }  
			  }  
			  return dp[t.length()][s.length()];  
		 
	 }
}
