package q81_90;

import q81_90.q82.ListNode;

public class q83 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
	
	// same as q82, easier way, no need the pre node and dummy head
	 public ListNode deleteDuplicates(ListNode head) {
	        
		 ListNode cur = head;
		 
		 while (cur != null) {
			 if (cur.next != null&& cur.val == cur.next.val) {
				 if (cur.next.next != null) {
					 cur.next = cur.next.next;
				 } else {
					 cur.next = null;
				 }
			 } else {
				 cur = cur.next;
			 }
		 }
		 
		 return head;
	 }
}
