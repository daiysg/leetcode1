package q101_110;


public class q108 {

	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode sortedArrayToBST(int[] nums) {

		if (nums == null || nums.length == 0)
			return null;

		
		return buildTree(nums, 0, nums.length-1);
	}

	private TreeNode buildTree(int[] nums, int left, int right) {
		// TODO Auto-generated method stub
		
		if (left> right) return null;
		if (left == right) {
			TreeNode curTreeNode = new TreeNode(nums[left]);
			curTreeNode.left = null;
			curTreeNode.right = null;
			return curTreeNode;			
		}
		
		int mid = (left+right)/2;
		TreeNode curTreeNode = new TreeNode(nums[mid]);
		TreeNode leftTreeNode = buildTree(nums, left, mid-1);
		TreeNode rightTreeNode = buildTree(nums, mid+1, right);
		curTreeNode.left = leftTreeNode;
		curTreeNode.right = rightTreeNode;
		return curTreeNode;
	}
	
	
}
