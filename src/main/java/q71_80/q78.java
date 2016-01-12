package q71_80;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q78 {

	//dfs, recursion way, same as permutation
	// quite important quiz, need to remember.
	 public List<List<Integer>> subsets(int[] nums) {
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
		
		result.add(new ArrayList<Integer>(path)); // add current result, if permutation, check curindex to all and add;
		
		// recursion and rollback, add to result, then remove 
		for (int i = curIndex; i< nums.length; i++) {
			  path.add(nums[i]);
			  subsetsWay(nums, result, path, i + 1);
	          path.remove(path.size() - 1);
		}
		
	}
}
