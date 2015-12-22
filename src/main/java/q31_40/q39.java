package q31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//backtrack problem
public class q39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		getResult(result, new ArrayList<Integer>(), candidates, target, 0);

		return result;
	}

	private void getResult(List<List<Integer>> result,
			ArrayList<Integer> curResult, int[] candidates, int target, int i) {
		// TODO Auto-generated method stub
		if (target>0)
		for (int j=i; j<candidates.length && target>=candidates[j]; j++)
		{
			curResult.add(candidates[j]);
			getResult(result, curResult, candidates, target-candidates[j], j);
			curResult.remove(curResult.size()-1);
		}

		if (target==0)
		{
			result.add(new ArrayList<Integer>(curResult));
		}
	}
}
