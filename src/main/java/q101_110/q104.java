package q101_110;

import q101_110.q103.TreeNode;

public class q104 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public int maxDepth(TreeNode root) {
        
		if (root == null) return 0;
		
		return dfs( root, 0);
    }

	private int dfs(TreeNode root, int i) {
		// TODO Auto-generated method stub
		if (root == null) return i;
		
		
		int leftDepth = dfs(root.left, i+1);
		int rightDepth = dfs(root.right, i+1);
		return Math.max(leftDepth, rightDepth);
	}
}
