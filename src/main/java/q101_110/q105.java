package q101_110;

import java.util.HashMap;
import java.util.Map;


//recursive way
// the first one of preorder should be the root
//for every preorder index, find the index location and generate the left child and right child

public class q105 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	//preorder from first one and to get the location of inorder(convert to map already)
	// all left from inorder shows the left child. 
	  private Map<Integer, Integer> map = null;
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        map = new HashMap<Integer, Integer>();
	        for(int i=0;i<inorder.length;i++){
	            map.put(inorder[i], i);
	        }
	        return buildTree(inorder, preorder, 0, inorder.length-1, 0, inorder.length-1);
	    }
	    private TreeNode buildTree(int[] inorder, int[] preorder, int si, int ei, int sp, int ep){
	        if(si>ei||sp>ep) return null;
	        TreeNode root = new TreeNode(preorder[sp]);
	        int idx = map.get(preorder[sp]);
	        TreeNode left = buildTree(inorder, preorder, si, idx-1, sp+1, sp+idx-si);
	        TreeNode right = buildTree(inorder, preorder, idx+1, ei, ep-ei+idx+1, ep);
	        root.left = left;
	        root.right = right;
	        return root;
	    }
}
