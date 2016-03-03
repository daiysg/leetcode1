package q101_110;


public class q109 {


	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public class ListNode {
		int val;
		ListNode next;
		
		ListNode(int x) {
			val = x;
		}
	}
	
	
//same as q108, use slow and fast to find the mid
public TreeNode sortedListToBST(ListNode head) {
        
		if (head == null)
			return null;
		if (head.next == null)
			return new TreeNode(head.val);
		
		return createTree(head, null);
    }

	private TreeNode createTree(ListNode head, ListNode tail) {
		// TODO Auto-generated method stub
		
		ListNode slow = head;
		ListNode fast = head;
		
		// find the mid
		while(fast!=tail&&fast.next!=tail){
	        fast = fast.next.next;
	        slow = slow.next;
	    }
		
		
		TreeNode thead = new TreeNode(slow.val);
	    thead.left = createTree(head,slow);
	    thead.right = createTree(slow.next,tail);
		
		return thead;
		
	}
}
