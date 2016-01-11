package q71_80;

import java.util.Arrays;


public class q72 {
//http://fisherlei.blogspot.sg/2012/12/leetcode-edit-distance.html
	//dp way
	//if word1[0, i-1] == word2[0, j-1], current step is k;
	//then if word1[i] == word2[j], so k unchanged,
	// if !=
	// three ways, 1, change words1[i] to words2[j];
	// 2. remove words1[i];
	// 3. add words2[j];
	//p[i][j] =  dp[i-1][j-1]   if (A[i] == B[j])
    //or = min(dp[i][j-1], dp[i-1][j], dp[i-1][j-1]) +1;
	
	public int minDistance(String word1, String word2) {

		//just to record the prev line to new line, the simple 2d array ways.
		int[] prev = new int[word2.length()+1];
		int[] curr = new int[word2.length()+1];
		
		// set up, for word1.length = 0, the way to generate word 2 is i steps, all add. 
		for (int i=0; i<=word2.length(); i++) {
			prev[i] = i;
		}
		
		 for(int i=1; i <= word1.length(); i++){
			 curr[0] = i;
			 for(int j=1; j <= word2.length(); j++){
				 // if equal, current equals to prev
	                if(word1.charAt(i-1) == word2.charAt(j-1)){
	                    curr[j] = prev[j-1];
	                }
	                else{
	                	int switchWay = prev[j-1]+1;
	                	int addWay = curr[j-1] + 1;
	                	int removeWay =  prev[j]+1;
	                    curr[j] = Math.min(switchWay,Math.min(addWay, removeWay));
	                }
	            }
			 
			   prev = Arrays.copyOf(curr,curr.length); // copy from current to previous
		 }
		 
		 return prev[word2.length()];
	}
}
