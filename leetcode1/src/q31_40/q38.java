package q31_40;

import java.util.ArrayList;
import java.util.Stack;

public class q38 {

	public static String countAndSay(int n) {
		String result = "1";
		if (n == 0)
			return "";
		if (n == 1)
			return result;
		Stack<Integer> currentCount = new Stack<Integer>();
		Stack<Integer> newStack = new Stack<Integer>();
		for (int i = 0; i < n-1; i++) {

			currentCount.push(1);
			newStack.push(result.charAt(0) - '0');
			for (int j = 1; j < result.length(); j++) {
				if ((result.charAt(j) - '0') == newStack.peek()) {
					Integer count = currentCount.pop() + 1;
					currentCount.push(count);
				}

				else {
					currentCount.push(1);
					newStack.push(result.charAt(j) - '0');
				}
			}

			StringBuilder sb = new StringBuilder();
			while (!currentCount.empty()) {
				String current = currentCount.pop().toString()
						+ newStack.pop().toString();
				sb.insert(0, current);
			}

			result = sb.toString();
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countAndSay(2));
	}

}
