package q61_70;

//simple quiz
public class q66 {

	public int[] plusOne(int[] digits) {

		if (digits.length == 0) {
			return digits;
		}

		//if last digit not nine
		if (digits[digits.length-1] != 9) {
			digits[digits.length-1]++;
			return digits;
		}
		
		// if is nine, then push back
		int n = digits.length-1;
		while (n>=0 && digits[n] == 9) {
			digits[n] = 0;
			n--;
		}
		
		//from the beginning
		if (n > -1) {
			digits[n]++;
			return digits;
		} else {
			int[] result = new int[digits.length+1];
			result[0] = 1;
			for (int i=1; i< result.length; i++) {
				result[i] = 0;
			}
			
			return result;
		}
		
	}
}
