package q41_50;

//solution 
//1. find the highest point;
//2. from left and right of the highest point, for each point, find whether it is the higher point,
// current, if so calculate the square between added current height to top, 
//3. in each loop, reduce the current length
public class q42 {

	
	 public int trap(int[] height) {
	        
		 int highestPoint = -1;
		 int highestIndex = -1;
		 int maxTrap = 0;
		 //highest point
		  for (int i=0; i< height.length; i++) {
			  
			  if (height[i]>highestPoint) {
				  highestPoint = height[i];
				  highestIndex = i;
			  }
		  }
		  
		  //left part
		  
		  int currentHigh = 0;
		  for (int i=0; i<highestIndex; i++) {
			  if (height[i]>currentHigh) {
				  //add the income
				  maxTrap = maxTrap + (height[i] - currentHigh)*(highestIndex -i);
				  currentHigh = height[i];
			  }
			  
			  // reduce the outcome
			  maxTrap = maxTrap-height[i];
		  }
		  
		  // right part
		  currentHigh = 0;
		  for (int i = height.length-1; i>highestIndex; i-- ) {
			  if (height[i]>currentHigh) {
				  maxTrap = maxTrap + (height[i] - currentHigh)*(i - highestIndex);
				  currentHigh = height[i];
			  }
			  maxTrap = maxTrap-height[i];
			  
		  }
		  
		  
		  return maxTrap;
	  }
}
