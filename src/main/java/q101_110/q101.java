package q101_110;

import q91_100.q100.TreeNode;

public class q101 {

	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	// two solution
	// 1. recursion with left and right;
	// 2. BFS; for left child from left to right, for right child from right to left,
	// see whether the same result
	 public boolean isSymmetric(TreeNode root) {
	 
		 if (root == null) return true;
		 
		 return isSymmetricRecursion(root.left, root.right);
	 }

	private boolean isSymmetricRecursion(TreeNode leftTree, TreeNode rightTree) {
		// TODO Auto-generated method stub

		if (leftTree == null && rightTree == null)
			return true;

		if (leftTree == null || rightTree == null)
			return false;

		if (leftTree.val != rightTree.val)
			return false;
		if (!isSymmetricRecursion(leftTree.left, rightTree.right))
			return false;
		if (!isSymmetricRecursion(leftTree.right, rightTree.left))
			return false;
		
		return true;
	}
}
