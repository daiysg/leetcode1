package q11_20;

public class q11 {

	//quite common quiz, from two sid to the middle, increase the small one;
	 public int maxArea(int[] height) {
	        int maxValue=0;
	        int startPoint=0;
	        int endPoint=height.length-1;
	        while (startPoint<endPoint)
	        {
	        	int curValue=Math.min(height[startPoint], height[endPoint])*(endPoint-startPoint);
	        	if (curValue>maxValue) maxValue=curValue;

	        	if (height[startPoint]<height[endPoint]) startPoint++;
	        	else endPoint--;
	        }

	        return maxValue;
	    }
}
