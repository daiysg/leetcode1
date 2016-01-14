package q81_90;

import java.util.Arrays;
import java.util.Stack;

public class q84 {

	// 1. O(n^2) result, find all [i, j] in height and get the min bar, calculate result
	// 2. O(n) result, www.cnblogs.com/lichen782/p/leetcode_Largest_Rectangle_in_Histogram.html
	// 2.1. create a stack, to push all increaing node,
	// 2.2 for all decreased node, pop every inside the node to calculate the rectangle square.
	
	 public int largestRectangleArea(int[] height) {
	 
		 Stack<Integer> stack = new Stack<Integer>();
		 int i = 0;
		 int maxArea = 0;
		 
		 int[] h = new int[height.length + 1];
		  h = Arrays.copyOf(height, height.length + 1); // the copy of way 
		  
		  while (i < h.length) {
			  
			  //push if increasing
			  
			  if (stack.empty() || stack.peek()<=h[i]) {
				  stack.push(i);
				  i++;
			  } else {
				  //pop the top one by one and calculate the square  
				  int t = stack.pop();
				  int currentArea= 0;
				  if (stack.empty()) {
					  currentArea = i*h[t];
				  } else {
					  currentArea = (i-stack.peek()+1)*h[t];
				  }
				  
				  if (currentArea>maxArea) {
					  maxArea = currentArea;
				  }
			  }
		  }
		  
		  return maxArea;		 
	 }
}
