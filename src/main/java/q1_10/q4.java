package q1_10;
public class q4 {


	//Simple quiz, remember to set two node, one point to the start and one point to the current;
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int extra=0;
		ListNode result = null;
		if (l1!=null &&l2!=null)
		{
			result=new ListNode((l1.val+l2.val+extra)%10);
			if (l1.val+l2.val+extra>9)
			{
				extra=1;
			}
			else {
				extra=0;
			}
			l1=l1.next;
			l2=l2.next;
		}

		ListNode resultCur=result;
		while (l1!=null && l2!=null)
		{
			ListNode curList=new ListNode((l1.val+l2.val+extra)%10);
			if (l1.val+l2.val+extra>9)
			{
				extra=1;
			}
			else {
				extra=0;
			}
			resultCur.next=curList;
			resultCur=curList;
			l1=l1.next;
			l2=l2.next;
		}

		if (l1==null)
		{
			if (extra==0)
			{
				resultCur.next=l2;
			}
			else
			{
				if (l2==null)
				{
					ListNode lastNode=new ListNode(1);
					resultCur.next=lastNode;
				}
				else {
					ListNode lastNode=new ListNode(1);
					resultCur.next=addTwoNumbers(lastNode, l2);
				}
			}
		}

		if (l2==null)
		{
			if (extra==0)
			{
				resultCur.next=l1;
			}
			else
			{
				if (l1==null)
				{
					ListNode lastNode=new ListNode(1);
					resultCur.next=lastNode;
				}
				else {
					ListNode lastNode=new ListNode(1);
					resultCur.next=addTwoNumbers(lastNode, l1);
				}
			}
		}
		return result;
	}

}
