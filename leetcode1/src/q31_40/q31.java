package q31_40;

public class q31 {

	// 3 steps: 1 right to left, choose "not increase" one;
	// 2. that place to right, choose the min large one;
	// 3. swap both;
	// 4/ swap the rest;
	public static void nextPermutation(int[] num) {
		// step 1
		if (num.length < 2)
			return;
		int length = num.length - 1;

		while (num[length - 1] > num[length]) {
			length--;
			if (length == 0)
				break;
		}

		// step 2
		if (length > 0) {
			length--;

			int right_to_swap = num.length - 1;
			while (right_to_swap >= 0 && num[right_to_swap] <= num[length]) {
				right_to_swap--;
			}

			// step 3

			int swap = num[right_to_swap];
			num[right_to_swap] = num[length];
			num[length] = swap;
			length++;
		}

		// step 4
		int end = num.length - 1;
		while (end > length) {
			int swap = num[length];
			num[length] = num[end];
			num[end] = swap;
			end--;
			length++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] test = new int[2];
		test[0] = 1;
		test[1] = 1;
		//test[2] = 1;
		nextPermutation(test);
	}
}
