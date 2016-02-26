package q101_110;

import java.util.ArrayList;
import java.util.List;

import q101_110.q102.TreeNode;

public class q103 {


	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		dfs(res, root, 0);
		return res;		
	}

	private void dfs(List<List<Integer>> res, TreeNode root, int length) {
		// TODO Auto-generated method stub
		if (root == null) return;
		if (length == res.size()) res.add(new ArrayList<Integer>());
		
		List<Integer> currentList = res.get(length);
		
		if (length%2 == 1) {
			currentList.add(0, root.val);
		} else {
			currentList.add(root.val);
		}
		
		
		dfs(res, root.left, length+1);
		dfs(res, root.right, length+1);
	}
}
