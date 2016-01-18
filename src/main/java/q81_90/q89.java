package q81_90;

import java.util.ArrayList;
import java.util.List;

public class q89 {

	// solution, find the recursion way
	// n = 1: 0, 1
	// n = 2: 00, 01, 11, 10 (0, 1, 3, 2)
	// n = 3: 000, 001, 011, 010, 110, 111, 101, 100 (0, 1, 3, 2, 6, 7, 5, 4)
	// so the result for n+1 is
	// 1. first part same as n, (0,1,3,2) for n=2 and n=3;
	// 2. second part is the reverse of n plus 2^n

	public List<Integer> grayCode(int n) {

		List<Integer> result = new ArrayList<Integer>();

		if (n < 0)
			return result;
		result.add(0);
		int shift = 1;// for 2^n
		for (int i = 1; i <= n; i++) {
			for (int j = result.size() - 1; j >= 0; j--) {
				result.add(result.get(j) + shift);// for reverse add
			}
			shift = shift * 2;
		}

		return result;
	}
}
