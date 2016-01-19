package q81_90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q90 {

	// same as subset I 
	// the only difference is to remove the duplicate choice in last lines.
	 public List<List<Integer>> subsetsWithDup(int[] nums) {
		 List<List<Integer>> result = new ArrayList<List<Integer>>();
	     List<Integer> path = new ArrayList<Integer>();
	     
	     if (nums == null) {
	         return result;
	     }
	     
	     Arrays.sort(nums);
	     
	     subsetsWay(nums, result, path, 0);
	     
	     return result;
		 
	 }

	private void subsetsWay(int[] nums, List<List<Integer>> result,
			List<Integer> path, int curIndex) {
		// TODO Auto-generated method stub
		result.add(new ArrayList<Integer>(path)); 
		
		// recursion and rollback, add to result, then remove 
		for (int i = curIndex; i< nums.length; i++) {
				path.add(nums[i]);
			   subsetsWay(nums, result, path, i + 1);
			    path.remove(path.size() - 1);
			    //after removed need to check the next unduplicated choice.
			    while(i<nums.length-1 && nums[i] == nums[i+1])  
			    i++;  
		}
	}
}
