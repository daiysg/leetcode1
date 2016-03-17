package q111_120;

public class q114 {

	public class TreeNode {
	     int val;
	     TreeNode left;
        TreeNode right;
	     TreeNode(int x) { val = x; }
	}
	
	//recursive way
	
	//suppose left child and right child is flattened
	// we only need to do one height
	 public void flatten(TreeNode root) {
	    
		 if (root == null) return;
		 TreeNode solution = flattenTree(root);
	 }

	private TreeNode flattenTree(TreeNode root) {
		// TODO Auto-generated method stub
		
		if(root == null) return null;
        TreeNode leftTail = flattenTree(root.left); //end part of left
        TreeNode rightTail = flattenTree(root.right);
        
        // modify if have left child
        if(root.left != null) {
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = null;
            leftTail.right = temp;
        }
        
        if(rightTail != null) return rightTail;
        if(leftTail!=null) return leftTail;
        return root;
		
	}
}
