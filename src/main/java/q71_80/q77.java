package q71_80;

import java.util.ArrayList;
import java.util.List;


public class q77 {

	// recursion answer, answer is n+combine(n-1, k-1);
	// like, combine(4,3) = 4+ combine (3, 2) , 3 + combine (2, 2)
	// combine (3, 2) = 3+ combine (2, 1) , 2+ combine (1, 1)
	public List<List<Integer>> combine(int n, int k) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentAns = new ArrayList<Integer>();

		recurCombine(result, currentAns, n, k);
		return result;
	}

	private void recurCombine(List<List<Integer>> result,
			List<Integer> currentAns, int n, int k) {
		// TODO Auto-generated method stub
		if (k==1) {
			//from n to 1, add to first 
			for (int i = 1; i<=n; i++) {
				currentAns.add(0, i);// first is index
				List curList = new ArrayList(currentAns);
				result.add(curList);// should create a new list to add.
				currentAns.remove(0);
			}
			
			return;
		} else {
			for (int i=n; i>=k; i++) {
				currentAns.add(0, i);
				List curList = new ArrayList(currentAns);
				recurCombine(result, curList, i-1, k-1);
				currentAns.remove(0);
			}
		}
	
		
	}
	
}
