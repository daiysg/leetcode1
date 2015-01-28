package q11_20;

public class q19 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (n < 0)
			return null;
		if (head == null)
			return null;
		ListNode endPoint = head;
		ListNode startConnPoint=head;
		ListNode endConnPoint=head;
		for (int i = 0; i < n - 1; i++) {
			if (endPoint.next != null)
				endPoint = endPoint.next;
			else
				return null;
		}


		if (endPoint.next==null) return head.next;
		endPoint=endPoint.next;
		endConnPoint=endConnPoint.next;
		while (endPoint.next!=null)
		{
			endPoint=endPoint.next;
			endConnPoint=endConnPoint.next;
			startConnPoint=startConnPoint.next;
		}

		startConnPoint.next=endConnPoint.next;
		return head;

	}
}
