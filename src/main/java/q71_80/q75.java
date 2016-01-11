package q71_80;

public class q75 {

	
	// quick sort to let pivot = 1;
	// three pointer, one for 0, one for 2, and one for pivot.
	 public void sortColors(int[] nums) {
		 
		 int i=0, left =0, right = nums.length -1 ;
		 
		 while (i<=right) {
			 if (nums[i] == 0) {
				 swap(nums, i, left);
				 i++;
				 left++;
			 } else if (nums[i] == 1) {
				 i++;
			 } else if (nums[i] == 2) {
				 swap(nums, i, right);
				 right--;// remember to not write i++ here
			 }
		 }
		 
	 }

	private void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int val = nums[i];
		nums[i] = nums[j];
		nums[j] = val;
		
	}
}
