package q81_90;


public class q86 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	//find the first larger then x node from left, then from that, find every smaller element insert to left
	public ListNode partition(ListNode head, int x) {

		if (head == null || head.next == null) return head;
		
		ListNode p = new ListNode(0);
		
		p.next = head;
		head = p;  
		
		ListNode pre = p;
		
		//find first element larger than x and its previous node
		while (p!=null && p.val<x) {
			 pre = p;  
			 p = p.next;  
		}
		
		if (p == null) return head.next;
		
		ListNode cur = pre;  
		while (p!=null) {
			// remember for every insert of <x node, the new end also need to update
			if (p.val<x) {
				ListNode temp = cur.next;// please create one to escape the cur.
				
				pre.next = p.next;
				cur.next = p;
				cur = p;  
				p.next = temp;  
				p = pre;  
			}	
			
			 pre=p;  
			  p= p.next;   
		}
		
		return head;
	}

}
