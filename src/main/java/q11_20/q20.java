package q11_20;

import java.util.Stack;

public class q20 {

	// use stack otherwise hard to do for [([]])
	// need to check null inside for pop or peek in stack

	/*public boolean isValid(String s) {
		int small = 0;
		int mid = 0;
		int large = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				small++;
				break;
			case ')':
				if (i!=0)
				{
					if (s.charAt(i-1)=='[' || s.charAt(i-1)=='{')
						return false;
				}
				small--;
				break;
			case '[':
				mid++;
				break;
			case ']':
				if (i!=0)
				{
					if (s.charAt(i-1)=='(' || s.charAt(i-1)=='{')
						return false;
				}
				mid--;
				break;
			case '{':
				large++;
				break;
			case '}':
				if (i!=0)
				{
					if (s.charAt(i-1)=='[' || s.charAt(i-1)=='(')
						return false;
				}
				large--;
				break;
			default:
				return false;
			}

			if (small < 0 || mid < 0 || large < 0)
				return false;
		}

		if (small != 0 || mid != 0 || large != 0)
			return false;
		else
			return true;
	}*/

	public boolean isValid(String s)
	{
		Stack <String> result=new Stack <String> ();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)=='('|| s.charAt(i)=='{' || s.charAt(i)=='[')
				result.push(s.substring(i, i+1));
			else
			{
				if (s.charAt(i)==')')
				{
					//need to check null inside~~~
					if (result.size()==0) return false;
					if (!result.peek().equals("("))
						return false;
					else
						result.pop();
				}
				if (s.charAt(i)==']')
				{
					if (result.size()==0) return false;
					if (!result.peek().equals("["))
						return false;
					else
						result.pop();
				}
				if (s.charAt(i)=='}')
				{
					if (result.size()==0) return false;
					if (!result.peek().equals("{"))
						return false;
					else
						result.pop();
				}
			}
		}

		if (result.size()==0)
			return true;
		else
			return false;
	}
}
