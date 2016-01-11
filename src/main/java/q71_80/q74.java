package q71_80;

public class q74 {

	//two times binary search
	//remember the way for while loop, classical binary search
	 public boolean searchMatrix(int[][] matrix, int target) {
		 
		 int totalLength = matrix.length;
		 
		 int left = 0;
		 
		 int right = totalLength -1;
		 
		 while (left<= right) {
			 int mid = (left+right)/2;
			 if (matrix[mid][0]< target) left = mid+1;
			 else if (matrix[mid][0]> target) right = mid-1;
			 else if (matrix[mid][0] == target) return true;
			 if (left < 0 || right < 0) return false;
		 }
		 
		 if (left > right) {
			 // should be the smaller left part
			 return binarySearch(matrix[right], target); 
		 } else {
			 return binarySearch(matrix[left], target);
		 }
		 		 
		 
	 }

	private boolean binarySearch(int[] is, int target) {
		// TODO Auto-generated method stub
		 
		 int totalLength = is.length;
		 
		 int left = 0;
		 
		 int right = totalLength -1;
		 
		 while (left<= right) {
			 int mid = (left+right)/2;
			 if (is[mid]< target) left = mid+1;
			 else if (is[mid]> target) right = mid-1;
			 else if (is[mid] == target) return true;
			 if (left < 0 || right < 0) return false;
		 }
		 
		 return false;
		
	}
}
