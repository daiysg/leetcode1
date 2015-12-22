package q1_10;
public class q8 {

	// lots of special cases for this quiz;
	// 1. +400=400
	// 2. +400 0=400
	// 3. overflow check cannot directly check, need to check when Integer.MAX_VALUE / 10;
	public int atoi(String str) {

		long result = 0;
		boolean negativeFlg = false;
		// str=str.replace(" ", "");

		int i = 0;
		if (str.length() == 0)
			return 0;
		while (str.charAt(i) == ' ') {
			i++;
		}
		if (str.charAt(i) == '-') {
			negativeFlg = true;
			i++;
		} else if (str.charAt(i) == '+') {
			i++;
		}

		int max = Integer.MAX_VALUE / 10;

		for (; i < str.length(); i++) {
			if ((str.charAt(i) < '0') || (str.charAt(i) > '9')) {
				if (negativeFlg)
					result = result * (-1);
				return (int) result;
			} else {
				if (result > max) {
					if (negativeFlg == false) {
						return 2147483647;
					} else {
						return -2147483648;
					}
				}
				else if ((result == max) && (str.charAt(i)>'7')) {
					if (negativeFlg == false) {
						return Integer.MAX_VALUE;
					} else {
						return -Integer.MIN_VALUE;
					}
				}
			}

			int value = str.charAt(i) - '0';
			result = result * 10 + value;
		}

		if (negativeFlg)
			result = result * (-1);
		return (int) result;
	}
}
