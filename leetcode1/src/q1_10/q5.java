package q1_10;
public class q5 {


/*	public static String longestPalindrome(String s) {

		String modifyS = "";
		int currentMaxPoint = 0;
		int currentMaxLength = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			modifyS = modifyS + s.charAt(i) + "#";
		}

		modifyS = "#" + modifyS + s.charAt(s.length() - 1) + "#";

		for (int i = 1; i < modifyS.length(); i++) {
			int j = i;
			boolean test=false;
			String previous = modifyS.substring(i - j, i);
			String next = "";
			if (i + j + 1 >= modifyS.length()) {
				next = new StringBuilder(modifyS.substring(i + 1)).reverse()
						.toString();
			} else {
				next = new StringBuilder(modifyS.substring(i + 1, i + j + 1))
						.reverse().toString();
			}
			while ((j > 1) && (!previous.equals(next))) {

				test=true;
				previous = modifyS.substring(i - j, i);
				if (i + j + 1 >= modifyS.length()) {
					next = new StringBuilder(modifyS.substring(i + 1))
							.reverse().toString();
				} else {
					next = new StringBuilder(
							modifyS.substring(i + 1, i + j + 1)).reverse()
							.toString();
				}
				j = j - 2;
			}
			if (j > 1) {
				if (test)
				{
					j=j+2;
				}
				if (j > currentMaxLength) {
					currentMaxLength = j;
					currentMaxPoint = i;
					j=j-2;
				}
			}
		}

		String result = modifyS.substring(currentMaxPoint - currentMaxLength,
				currentMaxPoint + currentMaxLength);
		result = result.replace("#", "");
		return result;
	}
	*/

	private String maxString = "";
	private int maxLength = 0;

	public String longestPalindrome(String s) {
	    char[] chars = s.toCharArray();
	    int length = chars.length;
	    for (int i=0; i<length; i++) {
	        // find longest odd palindrome
	        findPalindrome(chars, length, i, 0);
	        // find longest even palindrome
	        findPalindrome(chars, length, i, 1);
	    }
	    return maxString;
	}

	private void findPalindrome(char[] chars, int length, int i, int shift) {
	    int left = i;
	    int right= i+shift;
	    while (left >= 0 && right < length && chars[left] == chars[right]){
	        left--; right++;
	    }
	    if ((right-left-1) > maxLength) {
	        maxLength = right-left-1;
	        maxString = new String(chars, left+1, maxLength);
	    }
	}

	/**
	 * @param args
	 */

}
