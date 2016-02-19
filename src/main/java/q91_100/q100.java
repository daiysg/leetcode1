package q91_100;

public class q100 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
	
		if (p==null && q==null) return true;
		
		if (p==null || q==null) return false;
		
		if (p.val == q.val) {
			boolean valLeft= isSameTree(p.left, q.left);
			
			boolean valRight = isSameTree(p.right, q.right);
			
			if (valLeft && valRight) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
}
