package q11_20;

public class q16 {

	 public int threeSumClosest(int[] num, int target) {
			int currentResult = num[0] + num[1] + num[2];

			for (int i = 0; i < num.length - 2; i++) {
				for (int j = i + 1; j < num.length - 1; j++) {
					for (int k = j + 1; k < num.length; k++) {
						if (num[i] + num[j] + num[k] - target == 0)
							return target;
						if (Math.abs(num[i] + num[j] + num[k] - target) < Math.abs(currentResult
								- target)) {
							currentResult =num[i] + num[j] + num[k];
						}
					}
				}

			}

			return currentResult;

		}
}
