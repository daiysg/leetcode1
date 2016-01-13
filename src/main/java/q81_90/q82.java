package q81_90;

public class q82 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	// remember that the first note also can be deleted. so prepare a dummyhead to avoid error
	// add two pointer, one for previous one for next.
	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) return head;
		ListNode dummyHead = new ListNode(0);
		
		dummyHead.next = head; 
		
		boolean duplicate = false;
		ListNode current = head;
		ListNode pre = dummyHead;
		
		while (current != null) {
			// have duplicate
			if (current.next != null && current.next.val == current.val) {
				ListNode duplicateNode= current.next;
				current.next = duplicateNode.next;
				duplicate = true;
			}
			
			//end of duplicate
			else if(duplicate) {
				pre.next = current.next;
				duplicate = false;
				current = current.next;
			}
			
			else {
				pre = current;
				current = current.next;
			}
			
		}
		
		return dummyHead.next;
	}
}
