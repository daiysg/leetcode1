package q41_50;

//greedy, everytime find the farest way that can cover
//eachtime moving forward by one step, and check that current point is further than last time we check or not.
//aka, check until current step, which can we finally achieved.

//remember that [3,2] means in i=0; we can jump 3 or 2 or 1, different from backtracking.

public class q45 {

	 public int jump(int[] nums) {
	        
		 int curFarest= 0;
		 int step = 0; 
		 int lastCheck = 0;
		 
		 for (int i=0; i< nums.length; i++) {
			 if (i> lastCheck) {
				 lastCheck = curFarest;
				 step++;
			 }
			 
			 if (curFarest < i+nums[i]) {
				 curFarest = i+nums[i];
			 }
			 
		 }
		 
		 return step;
	 }
	
}
