package q81_90;

public class q81 {

	// similar as binary search, need to consider whether left > mid
	// need to consider the target in new sequence part or between the rotation part.
	// e.g. if 4, 5, 1, 2, 3 if search 2, between 1 - 3 , normal binary search;
	// otherwise, if abnormal, need to consider case by case
	// Attention, need to consider equal case for start and end point.
	
	 public boolean search(int[] nums, int target) {
	 
		 int start = 0;
		 int end = nums.length-1;
		 
		 while (start<=end) {
			 
			 int mid = (start+end)/2;
			 
			 if (nums[mid] == target) return true;
			 
			 //check whether in sequence is in real increase
			 else if (nums[start]< nums[mid]) {
				 
				 //in left hand
				 
				 if (nums[start]<=target && nums[mid]>target) {
					 end = mid-1;
					 
			     //two cases 
				// 1. nums[mid]<target in right hand;
				// 2.  nums[mid]>target but nums[mid]>nums[end] 
				// like 2, 3, 4, 5, 1 to search 5, also in right hand since switch already.
				 } else {
					 start = mid+1;
				 }
			 } else if(nums[start] > nums[mid])  {
				 
				 // target in new sequence part. 
				 if (target > nums[mid] && target <= nums[end]) {
					 start = mid+1;
				 } else {
					 end = mid-1;
				 }
			 } else {
				 // since contain duplicate, just add start by 1 to reduce the case 
				 start++;
			 }
		 }
		 
		 return false;
	 }
}
