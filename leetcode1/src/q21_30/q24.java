package q21_30;

public class q24 {

	// remember to duplicate a new list to record the result;
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public static ListNode swapPairs(ListNode head) {
		if (head==null) return null;
		if (head.next==null) return head;
		ListNode result=new ListNode(0);
		result.next=head;
		ListNode result0=result;

		while (result.next!=null && result.next.next!=null)
		{
			ListNode leftSwap=result.next;
			ListNode rightSwap=result.next.next;
			if (result.next.next.next!=null)
			{
				result.next=rightSwap;
				ListNode nextStart=rightSwap.next;
			    rightSwap.next=leftSwap;
			    leftSwap.next=nextStart;
			}

			else {
				result.next=rightSwap;
				rightSwap.next=leftSwap;
				leftSwap.next=null;
			}
			result=leftSwap;
		}
		return result0.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		first.next=second;;

		System.out.println(swapPairs(first));
	}
}
