package q61_70;

// two pointer, slow and fast, slow before fast-k
// then slow.next is new head
// there exist case that k>list size, then k = k % listsize 
public class q61 {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	
	

	public ListNode rotateRight(ListNode head, int k) {
    
		if(head==null||head.next==null)
            return head;
		
		k=k%getLength(head);
		
		if(k==0)
            return head;
		ListNode fast = head;
		ListNode slow = head;
		while(k-- >0) {
			if (fast.next == null) return head;			
			fast=fast.next;
			
		}
            

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        ListNode newHead = slow.next;
        slow.next = null;
        fast.next = head;
        
        return newHead;
    }
	
	public int getLength(ListNode head){
        int res=0;
        while(head!=null){
            res++;
            head=head.next;
        }
        return res;
    }
}
