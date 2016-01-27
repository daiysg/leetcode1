package q91_100;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class q94 {

	 public class TreeNode {
		    int val;
		    TreeNode left;
	        TreeNode right;
		    TreeNode(int x) { val = x; }
	 }
	 
	 //iteration way, use a stack to add the current node
	 // away point to left
	 //stack is a good way to record all data with leaves above.
	 public List<Integer> inorderTraversal(TreeNode root) {
		 
		 List<Integer> resultList = new ArrayList<Integer>();
		 
		 if (root == null) return resultList;
		 
		 TreeNode cur = root;
		 
		 Stack<TreeNode> currentNode = new Stack<TreeNode>();
	       
		 
		 while (cur!=null || !currentNode.isEmpty()) {
			 if (cur!=null) {
				 currentNode.push(cur);
				 cur = cur.left;
				 
			 } else {
				 cur = currentNode.pop();
				 resultList.add(cur.val);
				 cur = cur.right;
			 }
		 }
		 
		 return resultList;
	 }
}
