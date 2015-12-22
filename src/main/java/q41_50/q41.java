package q41_50;

//two loops
// swap to make a[i] = i+1; 
// finally find the first one that a[i]!=i+1;

public class q41 {

	public int firstMissingPositive(int[] nums) {
		
		int curIndex = 0;
		
		while (curIndex<nums.length) {
			if (nums[curIndex] !=curIndex+1 && nums[curIndex]>=1 && nums[curIndex]<=nums.length && nums[nums[curIndex]-1]!= nums[curIndex]) {
				swap(nums, nums[curIndex], nums[nums[curIndex]-1]);
			} else {
				curIndex++;
			}					
		}
		
		
		for (int i=0; i< nums.length; i++) {
			if (nums[i]!= i+1) {
				return i+1;
			}
		}
		
		return nums.length+1;
	}

	private void swap(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
		int swap = nums[i];
		nums[i] = nums[j];
		nums[j] = swap;
	}

};
