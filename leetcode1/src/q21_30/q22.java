package q21_30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//like binary tree;
//two elements, remaining and current digit
public class q22 {

	 public static List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<String> ();
	        generate(n, 0, "", list);
	        return list;
	    }

	    public static void generate(int fpNumRemain, int bpNum, String str, List<String> list){
	        if(fpNumRemain == 0 && bpNum == 0){
	            list.add(str);
	            return;
	        }
	        String tempStr;
	        if(fpNumRemain > 0){
	            tempStr = str + "(";
	            generate(fpNumRemain - 1, bpNum + 1, tempStr, list);
	        }
	        if(bpNum > 0){
	            tempStr = str + ")";
	            generate(fpNumRemain , bpNum - 1, tempStr, list);
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(generateParenthesis(3));
	}
}
