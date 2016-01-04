package q51_60;

import java.util.ArrayList;

//math quiz
// for 4 digit there are 4! = 24 cases;
// after fixing the first difit, there are 3! = 6 cases.
// get k = k-1 consider 0 
// so the first digit is (k)/(n-1)!+1 and the unused digit from the left.
// e.g. k=5 n = 3; 
// 123, 132, 213, 231, 312, 321, the start of fifth one is 3, which is 4/(3-1)! = 2, so the 2+1 unused digit is 3
// later
// So like 
public class q60 {

	public static String getPermutation(int n, int k) {
		ArrayList<Integer> digits = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			digits.add(i);
		}

		k--;
		StringBuilder sb = new StringBuilder();

		int sum = 1;
		// n!
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}

		for (int i = n; i >= 1; i--) {
			sum /= i; // reuse the n!
			int digitIndex = k / sum;
			k = k % sum;

			// Line 25: error: cannot find symbol: method digits(int)
			sb.append(digits.get(digitIndex));

			// remove the used digit.
			digits.remove(digitIndex);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getPermutation(3, 2));
	}


}
