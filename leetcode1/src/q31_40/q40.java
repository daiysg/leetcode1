package q31_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//need to set +1 to avoid the duplication
public class q40 {
	public static List<List<Integer>> ans;

	public static List<List<Integer>> combinationSum2(int[] candidates,
			int target) {
		ans = new ArrayList<List<Integer>>();
		List<Integer> curResult = new ArrayList<Integer>();
		Arrays.sort(candidates);
		findNext(candidates, target, -1, curResult);
		return ans;
	}

	static void findNext(int[] candidates, int target, int lastIdx,
			List<Integer> curResult) {
		if (target == 0) {
			ans.add(curResult);
			return;
		}

		for (int i = lastIdx + 1; i < candidates.length; ++i) {
			if (target - candidates[i] < 0)
				return;
			if (i > lastIdx + 1 && candidates[i - 1] == candidates[i]) // handle
																		// duplicates
				continue;
			List<Integer> curr = new ArrayList<Integer>(curResult);
			curr.add(candidates[i]);
			findNext(candidates, target - candidates[i], i, curr);
		}
	}
}
