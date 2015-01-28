package q31_40;

import java.util.Stack;

public class q32 {


	//stack to do this; stack include the index of bracket which is not matched
    public int longestValidParentheses(String s) {
    	 int res = 0;
    	    Stack<Integer> stack = new Stack<Integer>();
    	    for (int i = 0; i < s.length(); i++) {
    	       if (s.charAt(i)==')' && !stack.empty() && s.charAt(stack.peek())=='(')
    	       {
    	    	   stack.pop();
    	    	   if (stack.empty())
    	    	   {
    	    		   // can match all bracket;
    	    		   res=i+1;
    	    	   }

    	    	   // which means can match until the peek (!! e.g. (() the last ) can match the second (!
    	    	   else if (res<i-stack.peek()){
    	    		   res=i-stack.peek();
    	    	   }
    	       }
    	       else {
    	    	   stack.push(i);
    	       }
    	    }
    	    return res;
    }
}
