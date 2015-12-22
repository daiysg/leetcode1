package q11_20;

import java.util.List;
import java.util.ArrayList;

//consider special cases in these quiz... 
public class q17 {

	public static List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<String>();
		if (digits.equals("")) {
			String emptyString="";
			result.add(emptyString);
			return result;
		}
		for (int i = 0; i < digits.length(); i++) {
			result = letterCombinationsNewDigit(result, digits.charAt(i));
		}

		return result;
	}

	private static List<String> letterCombinationsNewDigit(List<String> result,
			char charAt) {
		// TODO Auto-generated method stub

		String currentPossible = "";
		List<String> finalResult = new ArrayList<String>();
		switch (charAt) {
		case '1':
			break;
		case '2':
			currentPossible = "abc";
			break;
		case '3':
			currentPossible = "def";
			break;
		case '4':
			currentPossible = "ghi";
			break;
		case '5':
			currentPossible = "jkl";
			break;
		case '6':
			currentPossible = "mno";
			break;
		case '7':
			currentPossible = "pqrs";
			break;
		case '8':
			currentPossible = "tuv";
			break;
		case '9':
			currentPossible = "wxyz";
			break;
		case '0':
			currentPossible = " ";
			break;
		}

		for (int i = 0; i < currentPossible.length(); i++) {
			if (result.size()==0)
			{
				finalResult.add(currentPossible.substring(i, i+1));
			}
			for (int j = 0; j < result.size(); j++) {
				finalResult.add(result.get(j) + currentPossible.charAt(i));
			}
		}
		return finalResult;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strs="2";
		System.out.println(letterCombinations(strs));
	}
}
