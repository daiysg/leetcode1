package q91_100;

public class q98 {

	
	 public class TreeNode {
    	 int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	 
	 //recursive way
	 
	 // every left child smaller than root and right child larger than root 
	 public boolean isValidBST(TreeNode root) {
	        
		 return recursiveResultBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	 }

	private boolean recursiveResultBST(TreeNode root, long minValue,
			long maxValue) {
		// TODO Auto-generated method stub
		
		if (root == null) return true;
		
		if (root.val<=minValue || root.val>= maxValue) return false;
		
		
		return recursiveResultBST(root.left, minValue, root.val) &&recursiveResultBST(root.right, root.val, maxValue);
	}
	 
	 
	 
}
