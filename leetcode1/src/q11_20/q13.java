package q11_20;

import java.util.HashMap;

public class q13 {

	HashMap<Character, Integer> value;

	public int romanToInt(String s) {
		value = new HashMap<Character, Integer>();
		value.put('M', 1000);
		value.put('D', 500);
		value.put('C', 100);
		value.put('L', 50);
		value.put('X', 10);
		value.put('V', 5);
		value.put('I', 1);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i < s.length() - 1
					&& value.get(s.charAt(i)) < value.get(s.charAt(i + 1)))
				sum -= value.get(s.charAt(i));
			else
				sum += value.get(s.charAt(i));
		}
		return sum;
	}
}
